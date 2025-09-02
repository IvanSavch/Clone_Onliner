package onliner.controller.shop;

import onliner.dto.MobileDto;
import onliner.entity.Shop;
import onliner.entity.mobile.Mobile;
import onliner.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

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
    public String mobile(MobileDto mobileDto, HttpSession session){
        Shop shop = (Shop) session.getAttribute("sessionShop");
        Mobile mobile = mobileService.createMobile(mobileDto);
        mobile.setShop(shop);
        mobileService.save(mobile);
        return "redirect:/shop/add";
    }

}
