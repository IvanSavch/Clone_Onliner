package onliner.dao.mobile;

import onliner.entity.mobile.Mobile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MobileDaoImpl implements MobileDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Mobile mobile) {
        sessionFactory.getCurrentSession().save(mobile);
    }

    @Override
    public List<Mobile> getAllMobile() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Mobile", Mobile.class).list();
    }
}
