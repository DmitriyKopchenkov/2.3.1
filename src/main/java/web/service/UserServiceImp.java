package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {


    private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {

        this.userDao = userDao;
    }

    @Transactional
    public void add(User user) {

        userDao.add(user);
    }

    @Transactional
    public List<User> index() {

        return userDao.index();
    }

    @Transactional
    public User show(int id) {

        return userDao.show(id);
    }

    @Transactional
    public void update(User updatedUser) {

        userDao.update(updatedUser);
    }

    @Transactional
    public void delete(int id) {

        userDao.delete(id);
    }

}
