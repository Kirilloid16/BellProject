package ru.lukah.bellproject.DAO.User;

import ru.lukah.bellproject.Model.User;

import java.util.List;

public interface UserDao {
    List<User> list();
    User getById (Long id);
    void User (User userUpdate);
}
