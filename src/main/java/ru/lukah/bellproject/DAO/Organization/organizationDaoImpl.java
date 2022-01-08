package ru.lukah.bellproject.DAO.Organization;


import org.springframework.stereotype.Component;
import ru.lukah.bellproject.Model.Organization;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;



@Component
public class organizationDaoImpl implements organizationdao {
    private final EntityManager entityManager;


    public organizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Organization> allOrganizations() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Organization> criteriaQuery = criteriaBuilder.createQuery(Organization.class);
        Root<Organization> organizationRoot = criteriaQuery.from(Organization.class);
        criteriaQuery.

    }


    public void update(int id,Organization updateOrganization) {
         Organization organization = entityManager.find(Organization.class,id);
        organization.setName(updateOrganization.getName());
        organization.setFullName(updateOrganization.getFullName());
        organization.setInn(updateOrganization.getInn());
        organization.setKpp(updateOrganization.getKpp());
        organization.setAddress(updateOrganization.getAddress());
        organization.setPhone(updateOrganization.getPhone());
        organization.setActive(updateOrganization.getIsActive());
         entityManager.persist(organization);
    }


    @Override
    public void post(Organization organization) {
        entityManager.persist(organization);

    }

    @Override
    public Organization getById(long id) {
       return entityManager.find(Organization.class,id);
    }
}

