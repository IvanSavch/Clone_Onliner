package onliner.dao;

import onliner.entity.User;

import java.util.Optional;

public interface UserDao {
    void save(User user);
    Optional<User> findByName(User user);
}
