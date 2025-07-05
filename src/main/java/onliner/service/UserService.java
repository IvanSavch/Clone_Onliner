package onliner.service;

import onliner.dao.UserDao;
import onliner.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void save(User user){
        userDao.save(user);
    }

    public Optional<User> findByName(User user){
        return userDao.findByName(user);
    }
}
