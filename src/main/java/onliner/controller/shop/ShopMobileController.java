package onliner.controller.shop;

import onliner.dto.MobileDto;
import onliner.entity.Shop;
import onliner.entity.mobile.Mobile;
import onliner.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.PersistenceException;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/add")
public class ShopMobileController {
    @Autowired
    private MobileService mobileService;
    @GetMapping("/mobile")
    public String mobile(Model model) {
        model.addAttribute("mobile", new MobileDto());
        return "AddMobile";
    }

    @PostMapping("/mobile")
    public String mobile(@ModelAttribute MobileDto mobile, HttpSession session, Model model){
        Shop shop = (Shop) session.getAttribute("sessionShop");
        Mobile newMobile = mobileService.createMobile(mobile);
        newMobile.setShop(shop);
        try {
            mobileService.save(newMobile);
        }catch (PersistenceException e){
            model.addAttribute("mobileError","This model newMobile exist");
        }
        model.addAttribute("mobile", new MobileDto());
        return "AddMobile";
    }

}
