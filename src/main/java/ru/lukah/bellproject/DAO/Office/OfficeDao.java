package ru.lukah.bellproject.DAO.Office;

import ru.lukah.bellproject.Model.Office;

import java.util.List;

public interface OfficeDao {
    // список всех офисов
    List<Office> allOffice();
    //получение офиса но id
    Office oneOffice(long id);
    //обновление информации иб офисе
    void saveOffice();
    //добавление нового офиса
    Office newOffice = new Office();
}
