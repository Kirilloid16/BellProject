package ru.lukah.bellproject.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.User.UserDao;
import ru.lukah.bellproject.Model.Country;
import ru.lukah.bellproject.Model.DocumentType;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Model.UserDocument;


import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Transactional
    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Transactional
    @Override
    public void post(User user) {
        userDao.post(user);
    }

    @Transactional
    @Override
    public User update(User user) {
        return userDao.update(user);
    }
    @Transactional
    @Override
    public List<User> list1(User user) {
        return userDao.list1(user);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

}
