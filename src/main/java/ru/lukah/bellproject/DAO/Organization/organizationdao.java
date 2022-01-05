package ru.lukah.bellproject.DAO.Organization;

import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface organizationdao {
    //read
    List<Organization> allOrganizations();
    //update
    void update(String name,String fullname,String address,int inn,int kpp,String phone,boolean isActive);
    //post
    void post(Organization organization);
    //получение по id из бд
    Organization getById(long id);
}
