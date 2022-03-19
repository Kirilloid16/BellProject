package ru.lukah.bellproject.DAO.Office;

import ru.lukah.bellproject.DTO.OfficeDto;
import ru.lukah.bellproject.Model.Office;
import ru.lukah.bellproject.Model.Organization;

import java.util.List;

public interface OfficeDao {
    List<Office> listOffice();
    //post
    void post(Office office);
    //получение по id из бд
    Office getById(long id);
    Office update(Office office);
    List<Office> listOffice1(Office office);
    void delete(Long id);
}
