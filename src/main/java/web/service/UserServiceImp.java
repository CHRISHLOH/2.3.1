package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;
@Service
@Transactional
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserByID(id);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
