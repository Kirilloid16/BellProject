package ru.lukah.bellproject.Mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ru.lukah.bellproject.DAO.Office.OfficeDao;
import ru.lukah.bellproject.DTO.OfficeDto;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Model.Office;
import ru.lukah.bellproject.Model.Organization;

@Mapper(componentModel = "spring")
@Service
public interface OfficeMapper {
    OfficeDto officeDto (Office office);
    Office officeModel (OfficeDto officeDto);
}
