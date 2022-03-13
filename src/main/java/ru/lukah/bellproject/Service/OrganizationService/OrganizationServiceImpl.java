package ru.lukah.bellproject.Service.OrganizationService;

import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Organization.OrganizationDao;


import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Mapper.OrganizationMapper;
import ru.lukah.bellproject.Model.Organization;


import javax.transaction.Transactional;
import java.util.List;


@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationDao organizationDao;
    private final OrganizationMapper organizationMapper;

    public OrganizationServiceImpl(OrganizationDao organizationDao, OrganizationMapper organizationMapper) {
        this.organizationDao = organizationDao;
        this.organizationMapper = organizationMapper;
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
}
