package onliner.dao.mobile;

import onliner.entity.mobile.Camera;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class CameraDaoImpl implements CameraDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Camera findByModelCamera(String model) {
        Session session = sessionFactory.getCurrentSession();
        Query<Camera> query = session.createQuery("from Camera where modelCamera = :model", Camera.class);
        query.setParameter("model", model);
        return query.getSingleResult();

    }
}
