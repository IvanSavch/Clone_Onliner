package onliner.dao;

import onliner.entity.Basket;
import onliner.entity.User;

import java.util.List;

public interface BasketDao {
    void save(Basket basket);
    List<Basket> findAllByUserId(User user);
}
