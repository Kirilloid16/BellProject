package ru.lukah.bellproject.DAO.Organization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Organization;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class OrganizationDaoImpl implements Organizationdao {
    private final EntityManager entityManager;

    @Autowired
    public OrganizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Organization> allOrganizations() {
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Organization> criteriaQuery = criteriaBuilder.createQuery(Organization.class);
//        Root<Organization> organizationRoot = criteriaQuery.from(Organization.class);
//        Predicate predicateConj = criteriaBuilder.conjunction();
//        Predicate predicate1 = criteriaBuilder.equal(organizationRoot.get("name"), organization.getName());
//        predicateConj = criteriaBuilder.and(predicateConj, predicate1);
//        if (organization.getInn() != null) {
//            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("inn"), organization.getInn());
//            predicateConj = criteriaBuilder.and(predicateConj, predicate);
//        }
//        if (organization.getIsActive() != null) {
//            Predicate predicate = criteriaBuilder.equal(organizationRoot.get("inn"), organization.getInn());
//            predicateConj = criteriaBuilder.and(predicateConj, predicate);
//        }
//        criteriaQuery.select(organizationRoot).where(criteriaBuilder.and(predicateConj, predicate1));
        TypedQuery<Organization> organizationTypedQuery = entityManager.createQuery("select Organization from Organization",Organization.class);
        List<Organization> allOrganizations = organizationTypedQuery.getResultList();
                return allOrganizations;
    }


    @Override
    public void post(Organization organization) {
        entityManager.persist(organization);
    }

    @Override
    public Organization getById(long id) {
        Organization organization = entityManager.find(Organization.class, id);
        return organization;
    }
}



