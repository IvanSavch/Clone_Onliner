package onliner.dao;

import onliner.entity.User;

import java.util.Optional;

public interface UserDao {
    void save(User user);
    User findByName(User user);
}
