package onliner.controller;


import onliner.dao.BasketDaoImpl;
import onliner.entity.Basket;
import onliner.entity.User;
import onliner.service.MobileService;
import onliner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private MobileService mobileService;

    @Autowired
    protected BasketDaoImpl basketDao;


    @Autowired
    private UserService userService;

    @GetMapping
    public String catalog() {
        return "Catalog";
    }

    @GetMapping("/mobile")
    public String mobile(Model model) {
        model.addAttribute("allMobile", mobileService.getAllMobile());
        return "MobileCatalog";
    }

    @PostMapping("/mobile")
    public String buy(BigDecimal price ,String model, HttpSession session){
        User userSession = (User) session.getAttribute("sessionUser");
        basketDao.save(new Basket(price,model,userSession));
        return "redirect:/catalog/mobile";
    }

}
