package ru.lukah.bellproject.Service.OrganizationService;


import org.springframework.validation.annotation.Validated;
import ru.lukah.bellproject.DTO.OrganizationDto;

import javax.validation.Valid;

@Validated
public interface OrganizationService  {

    // update по id
    void update(int id,@Valid OrganizationDto organizationDto);

    // получение списка
    // получение по айди
    OrganizationDto getById (int id);
    // добавление новой организации


}
