package onliner.service;

import onliner.dao.BasketDao;
import onliner.entity.Basket;
import onliner.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BasketService {

    @Autowired
    private BasketDao basketDao;

    @Transactional
    public void save(Basket basket) {
        basketDao.save(basket);
    }
    @Transactional
    public List<Basket>basketList(User user){
        return basketDao.findAllByUserId(user);
    }
    @Transactional
    public void deleteByUserId(Long id){
        basketDao.deleteById(id);
    }
}
