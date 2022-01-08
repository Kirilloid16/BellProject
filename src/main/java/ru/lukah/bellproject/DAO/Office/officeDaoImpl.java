package ru.lukah.bellproject.DAO.Office;

import ru.lukah.bellproject.Model.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class officeDaoImpl implements OfficeDao {

    private final EntityManager entityManager;


    public officeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Office> allOffice() {
        TypedQuery<Office> query = entityManager.createQuery("SELECT O.id, O.name,O.isActive from Office O",Office.class);
        return query.getResultList();
    }

    @Override
    public Office getOfficeById(long id) {
        return entityManager.find(Office.class,id);
    }

    @Override
    public void Officeupdate(int id, Office updateOffice) {
        Office office = entityManager.find(Office.class,id);
        office.setName(updateOffice.getName());
        office.setAddress(updateOffice.getAddress());
        office.setPhone(updateOffice.getPhone());
        office.setActive(updateOffice.getIsActive());
        entityManager.persist(office);
    }

    @Override
    public void postOffice(Office office) {
         entityManager.persist(office);
    }
}
