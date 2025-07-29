package onliner.dao;

import onliner.entity.Shop;

public interface ShopDao {
    void save(Shop shop);
    Shop findByName(Shop shop);
}
