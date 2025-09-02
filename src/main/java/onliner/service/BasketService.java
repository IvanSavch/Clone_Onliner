package onliner.service;

import onliner.dao.BasketDao;
import onliner.entity.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BasketService {

    @Autowired
    private BasketDao basketDao;

    @Transactional
    public void save(Basket basket) {
        basketDao.save(basket);
    }
}
