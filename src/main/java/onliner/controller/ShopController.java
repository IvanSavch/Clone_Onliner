package onliner.controller;

import onliner.entity.Shop;
import onliner.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.NoResultException;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;
    @GetMapping("/registration")
    public String shopRegistration(Model model){
        model.addAttribute("shop",new Shop());
        return "ShopRegistration";
    }
    @PostMapping("/registration")
    public String shopRegistration(@ModelAttribute Shop shop){
        shopService.save(shop);
        return "ShopRegistration";
    }

    @GetMapping("login")
    public String shopLogin(Model model){
        model.addAttribute("shop",new Shop());
        return "/ShopLogin";
    }

    @PostMapping("/login")
    public String shopLogin(@ModelAttribute Shop shop,Model model){
        try {
            if (shopService.findByName(shop).getPassportNumber().equals(shop.getPassportNumber())) {
                return "redirect:/shop";
            }
        }catch (NoResultException e){
            model.addAttribute("nameError","User or login incorrect");
            return "ShopLogin";
        }
        model.addAttribute("passError","User or login incorrect");
        return "/ShopLogin";
    }

    @GetMapping
    public String home(){
        return "ShopHome";
    }

}
