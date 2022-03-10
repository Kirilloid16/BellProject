package ru.lukah.bellproject.Service.UserService;

import ru.lukah.bellproject.Model.Country;
import ru.lukah.bellproject.Model.DocumentType;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Model.UserDocument;

import java.util.List;

public interface UserService {
    List<User> list();
    User getById(Long id);

}
