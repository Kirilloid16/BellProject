package ru.lukah.bellproject.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Organization;

@Mapper
public interface OrganizationMapper {
    Mapper INSTANCE = Mappers.getMapper(Mapper.class);
    OrganizationDto toDto (Organization organization);
}
