package onliner.dao.mobile;

import onliner.entity.mobile.ProcessorMobile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class ProcessorMobileDaoImpl implements ProcessorMobileDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public ProcessorMobile findByModel(String model){
        Session session = sessionFactory.getCurrentSession();
        Query<ProcessorMobile> query = session.createQuery("from ProcessorMobile where model = :model", ProcessorMobile.class);
        query.setParameter("model",model);

        return query.getSingleResult();
    }
}
