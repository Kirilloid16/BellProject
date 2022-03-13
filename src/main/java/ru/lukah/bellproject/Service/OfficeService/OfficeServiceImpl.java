package ru.lukah.bellproject.Service.OfficeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Office.OfficeDao;
import ru.lukah.bellproject.DTO.OfficeDto;
import ru.lukah.bellproject.Model.Office;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class OfficeServiceImpl implements OfficeService {
    private final OfficeDao officeDao;

    public OfficeServiceImpl(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }
    @Transactional
    @Override
    public List<Office> listOffice()
    {
        return officeDao.listOffice();
    }
    @Transactional
    @Override
    public void post(Office office) {
        officeDao.post(office);
    }
    @Transactional
    @Override
    public Office getById(long id) {
        return officeDao.getById(id);
    }

    @Override
    @Transactional
    public Office update(Office office) {
        return officeDao.update(office);
    }
}
