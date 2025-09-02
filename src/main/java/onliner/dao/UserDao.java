package onliner.dao;

import onliner.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User findByName(User user);

}
