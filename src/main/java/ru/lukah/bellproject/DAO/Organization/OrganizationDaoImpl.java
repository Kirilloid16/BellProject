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
       TypedQuery<Organization> organizationQuery = entityManager.createQuery("SELECT O from Organization O",Organization.class);
       List<Organization> organizationList = organizationQuery.getResultList();
                return organizationList ;
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



