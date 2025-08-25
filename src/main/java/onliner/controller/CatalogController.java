package onliner.controller;


import onliner.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private MobileService mobileService;

    @GetMapping
    public String catalog() {
        return "Catalog";
    }

    @GetMapping("/mobile")
    public String mobile(Model model) {
        model.addAttribute("allMobile",mobileService.getAllMobile());
        return "MobileCatalog";
    }

}
