package ru.lukah.bellproject.DAO.Organization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface Organizationdao  {
    //read
    List<Organization> allOrganizations(Organization organization);



    //post
    void post(Organization organization);

    //получение по id из бд
    Organization getById(long id);
}
