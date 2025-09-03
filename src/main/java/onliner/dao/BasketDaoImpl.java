package onliner.dao;

import onliner.entity.Basket;
import onliner.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BasketDaoImpl implements BasketDao {

    @Autowired
    private SessionFactory sessionFactory;
    public void save(Basket basket){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(basket);
    }

    @Override
    public List<Basket> findAllByUserId(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Basket> query = currentSession.createQuery("from Basket where user.id =: id", Basket.class);
        query.setParameter("id",user.getId());
        return query.getResultList();
    }
}
