package ru.lukah.bellproject.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lukah.bellproject.Service.OfficeService.OfficeService;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;
import ru.lukah.bellproject.Service.UserService.UserService;
@RestController
public class DeleteRestConroller {
    private final OrganizationService organizationService;
    private final OfficeService officeService;
    private UserService userService;

    public DeleteRestConroller(OrganizationService organizationService, OfficeService officeService, UserService userService) {
        this.organizationService = organizationService;
        this.officeService = officeService;
        this.userService = userService;
    }
    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.delete(id);
    }
    @DeleteMapping("/delete/office/{id}")
    public void deleteOffice(@PathVariable("id") Long id){
        officeService.delete(id);
    }
    @DeleteMapping("/delete/organization/{id}")
    public void deleteOrg(@PathVariable("id") Long id){
        organizationService.delete(id);
    }
}
