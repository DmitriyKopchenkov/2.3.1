package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> index();
    User show(int id);
    void update(User updatedUser);
    void delete(int id);
}
