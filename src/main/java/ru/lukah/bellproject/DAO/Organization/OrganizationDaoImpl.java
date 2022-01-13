package ru.lukah.bellproject.DAO.Organization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Organization;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository
public class OrganizationDaoImpl implements Organizationdao {
    private final EntityManager entityManager;

    @Autowired
    public OrganizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Organization> allOrganizations(Organization organization) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Organization> criteriaQuery = criteriaBuilder.createQuery(Organization.class);
        Root<Organization> organizationRoot = criteriaQuery.from(Organization.class);
        Predicate predicateConj = criteriaBuilder.conjunction();
        Predicate predicate1 = criteriaBuilder.equal(organizationRoot.get("name"), organization.getName());
        predicateConj = criteriaBuilder.and(predicateConj,predicate1);
        if(organization.getInn() != null){
            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("inn"),organization.getInn());
            predicateConj= criteriaBuilder.and(predicateConj,predicate);
        }
        if(organization.getIsActive() != null){
            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("inn"),organization.getInn());
            predicateConj = criteriaBuilder.and(predicateConj,predicate);
        }
        criteriaQuery.select(organizationRoot).where(criteriaBuilder.and(predicateConj,predicate1));
        TypedQuery<Organization> organizationTypedQuery = entityManager.createQuery(criteriaQuery);
        return organizationTypedQuery.getResultList();
    }


    @Override
    public void update(int id,Organization updateOrganization) {
         Organization organization = entityManager.find(Organization.class,id);
        organization.setName(updateOrganization.getName());
        organization.setFullName(updateOrganization.getFullName());
        organization.setInn(updateOrganization.getInn());
        organization.setKpp(updateOrganization.getKpp());
        organization.setAddress(updateOrganization.getAddress());
        organization.setPhone(updateOrganization.getPhone());
        organization.setIsActive(updateOrganization.getIsActive());
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

