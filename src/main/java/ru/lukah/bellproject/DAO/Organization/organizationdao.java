package ru.lukah.bellproject.DAO.Organization;

import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface organizationdao {
    //вывод всего из бд
    List<Organization> allOrganizations();
    //сохранение в изменений бд
    void  updateOrganization(Organization organization);
    //добавление в бд
   Organization postOrganization();
    //получение по id из бд
    Organization organization(long id);
}
