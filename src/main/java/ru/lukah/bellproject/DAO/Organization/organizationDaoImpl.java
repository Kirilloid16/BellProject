package ru.lukah.bellproject.DAO.Organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.lukah.bellproject.Model.Organization;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Component
public class organizationDaoImpl implements organizationdao{
    private final EntityManager entityManager;
    @Autowired
    public organizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Organization> allOrganizations() {
        String queryString ="Select Organization from Organization";
        TypedQuery<Organization> query = entityManager.createQuery(queryString,Organization.class);
        return query.getResultList();

    }

    @Override
    public Organization updateOrganization(Organization organization) {
        String queryString ="Update Organization Set id =  , ";
        TypedQuery<Organization> query =entityManager.createQuery(queryString,Organization.class);
        return query.getSingleResult();
    }

    @Override
    public Organization postOrganization() {
        return null;
    }


    @Override
    public Organization organization(long id) {
        return entityManager.find(Organization.class,id);
    }
}
