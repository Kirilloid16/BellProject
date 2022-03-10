package ru.lukah.bellproject.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.User.UserDao;
import ru.lukah.bellproject.Model.Country;
import ru.lukah.bellproject.Model.DocumentType;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Model.UserDocument;


import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

}
