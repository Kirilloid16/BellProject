package ru.lukah.bellproject.Service.OrganizationService;


import org.springframework.validation.annotation.Validated;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;

import javax.validation.Valid;
import java.util.List;

@Validated
public interface OrganizationService  {

    // update по id
    void update(int id,@Valid OrganizationDto organizationDto);

    // получение списка
    List<Organization> listOrganizations();
    // получение по айди
    Organization getById (int id);
    // добавление новой организации
    void post(OrganizationDto organizationDto);

}
