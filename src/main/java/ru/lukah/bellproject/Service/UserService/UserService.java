package ru.lukah.bellproject.Service.UserService;

import ru.lukah.bellproject.Model.User;

import java.util.List;

public interface UserService {
    List<User> list();
    User getById(Long id);

}
