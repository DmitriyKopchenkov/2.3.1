package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    List<User> index();
    User show(long id);
    void update(User updatedUser);
    void delete(long id);
}
