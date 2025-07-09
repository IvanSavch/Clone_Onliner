package onliner.controller;

import onliner.entity.User;
import onliner.service.UserService;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PersistenceException;
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
                model.addAttribute(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return "Registration";
        }

        try {
            userService.save(user);
        }catch (PersistenceException e){
            model.addAttribute("nameExist", "This name exist");
            return "Registration";
        }
        return "Registration";
    }

    @GetMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/login")
    public String login(User user) {

        return "Catalog";
    }

}
