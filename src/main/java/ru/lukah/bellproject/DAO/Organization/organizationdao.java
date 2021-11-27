package ru.lukah.bellproject.DAO.Organization;

import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface organizationdao {
    //вывод всего return
    List<Organization> allOrganization();
    //сохранение return
    void saveOrganization();
    //добавление return
   Organization organization =  new Organization();
    //получение по id return
    Organization organization(long id);
}
