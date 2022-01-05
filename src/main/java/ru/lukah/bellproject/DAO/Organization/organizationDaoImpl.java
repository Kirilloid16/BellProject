package ru.lukah.bellproject.DAO.Organization;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.lukah.bellproject.Model.Organization;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Component
public class organizationDaoImpl implements organizationdao {
    private final EntityManager entityManager;

    @Autowired
    public organizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Organization> allOrganizations() {
        String queryString = "Select Organization from Organization";
        TypedQuery<Organization> query = entityManager.createQuery(queryString, Organization.class);
        return query.getResultList();

    }

    @Override
    public void update(String name, String fullname, String address, int inn, int kpp, String phone, boolean isActive) {
        String queryString  = "Update Organization O Set O.name=:name,O.fullName=:fullname,O.address=:address,O.inn=:inn," +
                "O.kpp=:kpp,O.phone=:phone,O.isActive=:isActive";
        TypedQuery<Organization> query =entityManager.createQuery(queryString,Organization.class);
        query.setParameter("name",name);
        query.setParameter("fullname",fullname);
        query.setParameter("address",address);
        query.setParameter("inn",inn);
        query.setParameter("kpp",kpp);
        query.setParameter("phone",phone);
        query.setParameter("isActive",isActive);
    }

    @Override
    public void post(Organization organization) {

    }

    @Override
    public Organization getById(long id) {
        String queryString = "Select O from Organization O where o.id=:id";
        TypedQuery<Organization> query = entityManager.createQuery(queryString,Organization.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }
}


