package onliner.controller;

import onliner.entity.User;
import onliner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "Registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return "Registration";
        }

        try {
            userService.save(user);
        } catch (PersistenceException e) {
            model.addAttribute("nameExist", "This name exist");
            return "Registration";
        }
        return "Registration";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "Login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, HttpSession session, Model model) {
        try {
            if (userService.findByName(user).getPassword().equals(user.getPassword())){
                session.setAttribute("user", user);
                return "redirect:/catalog";
            }
        }catch (NoResultException e){
            model.addAttribute("userError","User not found");
            return "Login";
        }
        model.addAttribute("Incorrect","Incorrect login or password");
        return "Login";
    }


}
