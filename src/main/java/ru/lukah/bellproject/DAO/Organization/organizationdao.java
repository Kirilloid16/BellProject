package ru.lukah.bellproject.DAO.Organization;

import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface organizationdao {
    //вывод всего из бд
    List<Organization> allOrganization();
    //сохранение в изменений бд
    void  saveOrganization();
    //добавление в бд
   Organization organization();
    //получение по id из бд
    Organization organization(long id);
}
