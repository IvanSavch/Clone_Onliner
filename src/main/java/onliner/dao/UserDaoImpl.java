package onliner.dao;

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
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User findByName(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("from User where name = :name", User.class);
        query.setParameter("name", user.getName());
        return query.getSingleResult();
    }

}
