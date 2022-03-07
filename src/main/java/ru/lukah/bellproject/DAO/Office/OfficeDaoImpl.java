package ru.lukah.bellproject.DAO.Office;

import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class OfficeDaoImpl implements OfficeDao{

    private final EntityManager entityManager;

    public OfficeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Office> listOffice() {
        TypedQuery<Office> officeTypedQuery = entityManager.createQuery("Select O from Office O",Office.class);
        List<Office> officeList = officeTypedQuery.getResultList();
        return officeList;
    }

    @Override
    public void post(Office office) {

    }

    @Override
    public Office getById(long id) {
        return entityManager.find(Office.class,id);
    }
}
