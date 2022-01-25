package ru.lukah.bellproject.Mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;


@Mapper(componentModel = "spring")
@Service
public interface OrganizationMapper {
    OrganizationDto ModelToDto (Organization organization);
    Organization DtoToModel(OrganizationDto organizationDto);
}
