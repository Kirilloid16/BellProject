package ru.lukah.bellproject.DAO.Office;

import ru.lukah.bellproject.Model.Office;

import java.util.List;

public interface OfficeDao {
    // список всех офисов из бд
    List<Office> allOffice();
    //получение офиса по id из бд
    Office getOfficeById(long id);
    //обновление информации иб офисе в бд
    void Officeupdate(int id,Office updateOffice);
    //добавление нового офиса в бд
    void postOffice(Office office);
}
