package ru.lukah.bellproject.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.lukah.bellproject.Model.Office;
import ru.lukah.bellproject.Model.Organization;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Service.OfficeService.OfficeService;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;
import ru.lukah.bellproject.Service.UserService.UserService;

@RestController
public class PostRestController {
    private final OrganizationService organizationService;
    private final OfficeService officeService;
    private UserService userService;

    public PostRestController(OrganizationService organizationService, OfficeService officeService, UserService userService) {
        this.organizationService = organizationService;
        this.officeService = officeService;
        this.userService = userService;
    }
    @PostMapping("/organization/post")
    public void organization(@RequestBody Organization organization){
         organizationService.post(organization);
    }

    @PostMapping("/user/post")
    public void user(@RequestBody User user){
        userService.post(user);
    }
    @PostMapping("/office/post")
    public void office(@RequestBody Office office){
        officeService.post(office);
    }
}
