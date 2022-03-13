package ru.lukah.bellproject.DAO.Organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ru.lukah.bellproject.Model.Organization;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

    private final EntityManager entityManager;
    @Autowired
    public OrganizationDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Organization> allOrganizations() {
        TypedQuery<Organization> organizationQuery = this.entityManager.createQuery("SELECT O from Organization O", Organization.class);
        List<Organization> organizationList = organizationQuery.getResultList();
        return organizationList;
    }



    public void post(Organization organization) {
        this.entityManager.persist(organization);
    }

    public Organization getById(long id) {
        Organization organization = this.entityManager.find(Organization.class, id);
        return organization;
    }

    public Organization update(Organization organization) {
        return this.entityManager.merge(organization);
    }

    public List<Organization> organizations1(Organization organization1) {
        Query query;
        if ((organization1.getInn() != null)||(organization1.getActive() != null)) {
            query = this.entityManager.createQuery("select O.id,O.name,O.active from Organization O where O.active =:active or O.inn =:inn")
                    .setParameter("active",organization1.getActive()).setParameter("inn",organization1.getInn());
        } else {
            query = this.entityManager.createQuery("select O.id,O.name,O.active from Organization O where O.name =:name").setParameter("name", organization1.getName());
        }

        List<Organization> organizations1 = query.getResultList();
        return organizations1;
    }
}
