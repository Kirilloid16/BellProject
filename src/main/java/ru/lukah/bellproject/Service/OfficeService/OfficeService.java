package ru.lukah.bellproject.Service.OfficeService;

import ru.lukah.bellproject.DTO.OfficeDto;
import ru.lukah.bellproject.Model.Office;

import java.util.List;

public interface OfficeService {
    List<Office> listOffice();
    //post
    void post(Office office);
    //получение по id из бд
    Office getById(long id);
    Office update(Office office);
}
