package ru.lukah.bellproject.Service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Organization.Organizationdao;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService{

private final Organizationdao organizationDao;
private final OrganizationDto organizationDto;
     @Autowired
    public OrganizationServiceImpl(OrganizationDto organizationDto,Organizationdao organizationDao) {
        this.organizationDto = organizationDto;
        this.organizationDao=organizationDao;
    }


    @Override
    public OrganizationDto getByIdOrg() {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void post(OrganizationDto organizationDto) {

    }

    @Override
    public List<OrganizationDto> allorganization(Organization organization) {
        return null;
    }
}
