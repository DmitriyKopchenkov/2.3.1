package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    List<User> index();
    User show(int id);
    void update(int id, User updatedUser);
    void delete(int id);
}
