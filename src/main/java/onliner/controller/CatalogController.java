package onliner.controller;

import onliner.dao.mobile.MobileDao;
import onliner.dto.MobileDto;
import onliner.entity.mobile.MainCamera;
import onliner.entity.mobile.Mobile;
import onliner.mapper.MobileMapper;
import onliner.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private MobileMapper mobileMapper;
    @Autowired
    private MobileService mobileService;

    @GetMapping
    public String catalog(Model model) {
        model.addAttribute("dto", new MobileDto());

        return "Catalog";
    }

    @PostMapping
    public String catalog(MobileDto mobileDto, Model model) {
        Mobile mobile = mobileMapper.toMobile(mobileDto);

        mobileService.save(mobile);
        return "Catalog";
    }

}
