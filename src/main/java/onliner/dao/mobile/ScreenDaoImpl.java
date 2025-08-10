package onliner.dao.mobile;

import onliner.entity.mobile.Screen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class ScreenDaoImpl implements ScreenDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Screen findByModel(String model) {
        Session session = sessionFactory.getCurrentSession();
        Query<Screen> query = session.createQuery("from Screen where modelScreen = :model", Screen.class);
        query.setParameter("model",model);

        return query.getSingleResult();
    }
}
