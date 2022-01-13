package ru.lukah.bellproject.Service.OrganizationService;

import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;

import java.util.List;


public interface OrganizationService {
    //поиск по id
    OrganizationDto getByIdOrg();
    // update по id
    void update();
    // post
    void post (OrganizationDto organizationDto);
    // получение списка
    List<OrganizationDto> allorganization(Organization organization);
}
