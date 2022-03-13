package ru.lukah.bellproject.DAO.Organization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface OrganizationDao  {
    List<Organization> allOrganizations();
    //post
    void post(Organization organization);
    //получение по id из бд
    Organization getById(long id);
    // update
    Organization update(Organization organization);
    List<Organization> organizations1(Organization organization);
}
