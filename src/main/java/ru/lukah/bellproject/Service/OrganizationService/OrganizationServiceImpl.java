package ru.lukah.bellproject.Service.OrganizationService;

import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Organization.Organizationdao;

import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Mapper.OrganizationMapper;
import ru.lukah.bellproject.Model.Organization;


import javax.transaction.Transactional;
import java.util.List;


@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final Organizationdao organizationdao;
    private final OrganizationMapper organizationMapper;

    public OrganizationServiceImpl(Organizationdao organizationdao, OrganizationMapper organizationMapper) {
        this.organizationdao = organizationdao;
        this.organizationMapper = organizationMapper;
    }


    @Override
    @Transactional
    public List<Organization> listOrganizations() {
        List<Organization> list =  organizationdao.allOrganizations();
        return list;
    }

    @Override
    @Transactional
    public Organization getById(Long id) {
        return organizationdao.getById(id) ;
    }

    @Override
    @Transactional
    public void post(Organization organization) {
        organizationdao.post(organization);
    }

    @Override
    @Transactional
    public Organization update(Organization organization) {
        return organizationdao.update(organization);
    }

    @Override
    @Transactional
    public List<Organization> organizations1(Organization organization) {
        return organizationdao.organizations1(organization);
    }
}
