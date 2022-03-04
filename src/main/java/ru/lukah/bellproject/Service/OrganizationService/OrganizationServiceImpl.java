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
    public void update(int id, OrganizationDto Organization) {
        Organization updateOrganization =  organizationMapper.DtoToModel(Organization);
        Organization organization = organizationdao.getById(id);
        organization.setName(updateOrganization.getName());
        organization.setFullName(updateOrganization.getFullName());
        organization.setInn(updateOrganization.getInn());
        organization.setKpp(updateOrganization.getKpp());
        organization.setAddress(updateOrganization.getAddress());
        organization.setPhone(updateOrganization.getPhone());
        organization.setIsActive(updateOrganization.getIsActive());
        organizationdao.post(organization);
    }

    @Override
    @Transactional
    public List<Organization> listOrganizations() {
        return organizationdao.allOrganizations();
    }

    @Override
    @Transactional
    public Organization getById(int id) {
        return organizationdao.getById(id);
    }

    @Override
    public void post(OrganizationDto organizationDto) {
        organizationdao.post(organizationMapper.DtoToModel(organizationDto));
    }
}
