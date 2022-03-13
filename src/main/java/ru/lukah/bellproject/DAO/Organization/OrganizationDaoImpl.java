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
    public List<Organization> organizations1(Organization organization1) {
        TypedQuery<Organization> typedQuery;
        if(organization1.getInn() != null){
            typedQuery =  entityManager.createQuery("select O from Organization O where O.inn =:inn",Organization.class);
        } else if (organization1.getActive() != null){
            typedQuery= entityManager.createQuery("select O from Organization O where O.active =:active",Organization.class);
        } else if((organization1.getInn() != null) && (organization1.getActive()!=null)) {
            typedQuery= entityManager.createQuery("select O from Organization O where O.active =:active and O.inn =:inn",Organization.class);
        } else{
            typedQuery= entityManager.createQuery("select O from Organization O where O.name =:name",Organization.class).setParameter("name",organization1.getName());
        }
        List<Organization> organizations1 = typedQuery.getResultList();
        return organizations1;
    }
}



