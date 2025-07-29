package onliner.dao;

import onliner.entity.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDaoImpl implements ShopDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Shop shop) {
        sessionFactory.openSession().save(shop);
    }

    @Override
    public Shop findByName(Shop shop) {
        Session session = sessionFactory.openSession();
        Query<Shop> query = session.createQuery("from Shop where name = :name", Shop.class);
        query.setParameter("name",shop.getName());
        return query.getSingleResult();
    }
}
