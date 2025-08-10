package onliner.dao.mobile;

import onliner.entity.mobile.Mobile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class MobileDaoImpl implements MobileDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Mobile mobile) {
        sessionFactory.getCurrentSession().save(mobile);
    }

}
