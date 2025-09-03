package onliner.service;

import onliner.dao.UserDao;
import onliner.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user) throws PersistenceException {
        userDao.save(user);
    }

    @Transactional
    public User findByName(User user) {
        return userDao.findByName(user);
    }

}
