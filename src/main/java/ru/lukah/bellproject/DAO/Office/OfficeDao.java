package ru.lukah.bellproject.DAO.Office;

import ru.lukah.bellproject.Model.Office;

import java.util.List;

public interface OfficeDao {
    // список всех офисов из бд
    List<Office> allOffice();
    //получение офиса но id из бд
    Office oneOffice(long id);
    //обновление информации иб офисе в бд
    void saveOffice();
    //добавление нового офиса в бд
    Office newOffice = new Office();
}
