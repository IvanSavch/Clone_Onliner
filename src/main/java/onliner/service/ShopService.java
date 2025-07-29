package onliner.service;

import onliner.dao.ShopDao;
import onliner.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    @Autowired
    private ShopDao shopDao;

    public void save(Shop shop) {
        shopDao.save(shop);
    }

    public Shop findByName(Shop shop) {
        return shopDao.findByName(shop);
    }

}
