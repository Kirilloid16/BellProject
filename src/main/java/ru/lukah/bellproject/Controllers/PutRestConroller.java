package ru.lukah.bellproject.Controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.lukah.bellproject.Model.Office;
import ru.lukah.bellproject.Model.Organization;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Service.OfficeService.OfficeService;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;
import ru.lukah.bellproject.Service.UserService.UserService;

@RestController
public class PutRestConroller {
    private final OrganizationService organizationService;
    private final OfficeService officeService;
    private UserService userService;

    public PutRestConroller(OrganizationService organizationService, OfficeService officeService, UserService userService) {
        this.organizationService = organizationService;
        this.officeService = officeService;
        this.userService = userService;
    }
    @PutMapping("/organization/update")
    Organization update(@RequestBody Organization organization){
        return organizationService.update(organization);
    }

    @PutMapping("/user/update")
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @PutMapping("/office/update")
    public Office update(@RequestBody Office office){
        return officeService.update(office);
    }

}
