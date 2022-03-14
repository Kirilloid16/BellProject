package ru.lukah.bellproject.Service.OrganizationService;


import org.springframework.validation.annotation.Validated;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;


public interface OrganizationService  {

    // получение списка
    List<Organization> listOrganizations();
    // получение по айди
    Organization getById(Long id);

    // добавление новой организации
    void post(Organization organization);
    Organization update(Organization organization);
    List<Organization> organizations1(Organization organization);
    void delete(Long id);
}
