package onliner.dao;

import onliner.entity.Basket;
import onliner.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class BasketDaoImpl implements BasketDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void save(Basket basket){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(basket);
    }
}
