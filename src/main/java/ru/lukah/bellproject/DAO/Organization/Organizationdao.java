package ru.lukah.bellproject.DAO.Organization;

import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface Organizationdao {
    //read
    List<Organization> allOrganizations(Organization organization);

    //update
    void update(int id, Organization updateOrganization);

    //post
    void post(Organization organization);

    //получение по id из бд
    Organization getById(long id);
}
