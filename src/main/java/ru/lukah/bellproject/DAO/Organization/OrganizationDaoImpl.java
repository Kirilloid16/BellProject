package ru.lukah.bellproject.DAO.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Organization;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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

    @Override
    public Organization update(Organization organization) {
       return entityManager.merge(organization);
    }

//O.id,O.name,O.active (тестирую)
    @Override
    public List<Organization> organizations1(Organization organization) {
        Query query;
        if(organization.getInn() != null){
            query =  entityManager.createQuery("select O from Organization O where O.inn =:inn");
        } else if (organization.getActive() != null){
            query = entityManager.createQuery("select O from Organization O where O.active =:active");
        } else if((organization.getInn() != null) && (organization.getActive()!=null)) {
            query = entityManager.createQuery("select O from Organization O where O.active =:active and O.inn =:inn");
        } else{
            query = entityManager.createQuery("select O from Organization O where O.name =:name").setParameter("name",organization.getName());
        }
        List<Organization> organizations = query.getResultList();
        return organizations;
    }
}



