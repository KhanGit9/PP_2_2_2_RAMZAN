package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService  {
    UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void Add(User user) {
        userDao.Add(user);
    }

    @Override
    public void Remove(User user) {
        userDao.Remove(user);
    }

    @Override
    public void Update(User user) {
        userDao.Update(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
