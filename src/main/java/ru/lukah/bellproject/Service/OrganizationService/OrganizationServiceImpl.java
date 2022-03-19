package ru.lukah.bellproject.Service.OrganizationService;

import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Organization.OrganizationDao;


import ru.lukah.bellproject.Model.Organization;


import javax.transaction.Transactional;
import java.util.List;


@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationDao organizationDao;


    public OrganizationServiceImpl(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;

    }


    @Override
    @Transactional
    public List<Organization> listOrganizations() {
        List<Organization> list =  organizationDao.allOrganizations();
        return list;
    }

    @Override
    @Transactional
    public Organization getById(Long id) {
        return organizationDao.getById(id) ;
    }

    @Override
    @Transactional
    public void post(Organization organization) {
        organizationDao.post(organization);
    }

    @Override
    @Transactional
    public Organization update(Organization organization) {
        return organizationDao.update(organization);
    }

    @Override
    @Transactional
    public List<Organization> organizations1(Organization organization) {
        return organizationDao.organizations1(organization);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        organizationDao.delete(id);
    }
}
