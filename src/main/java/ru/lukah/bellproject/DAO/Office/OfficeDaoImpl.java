package ru.lukah.bellproject.DAO.Office;

import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Office;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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
        entityManager.persist(office);
    }

    @Override
    public Office getById(long id) {
        return entityManager.find(Office.class,id);
    }

    @Override
    public Office update(Office office) {
        return entityManager.merge(office);
    }

    @Override
    public List<Office> listOffice1(Office office) {
        Query query;
        if((office.getName()!= null) || (office.getPhone()!= null)||(office.getIsActive()!=null)){
            query = entityManager.createQuery("select O.id,O.name,O.isActive from Office O where O.name =:name or O.phone =:phone or O.isActive= :isActive")
                    .setParameter("name",office.getName()).setParameter("phone",office.getPhone()).setParameter("isActive",office.getIsActive());
        } else {
            query = entityManager.createQuery("select O.id,O.name,O.isActive from Office O where O.org_id =: org_id").setParameter("org_id",office.getOrg_id());
        }
        List<Office> officeList = query.getResultList();
        return officeList;
    }
}
