package ru.lukah.bellproject.Controllers.Get;


import org.springframework.web.bind.annotation.*;
import ru.lukah.bellproject.Model.Office;
import ru.lukah.bellproject.Model.Organization;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Service.OfficeService.OfficeService;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;
import ru.lukah.bellproject.Service.UserService.UserService;


import java.util.List;


@RestController
public class GetRestController {
    private final OrganizationService organizationService;
    private final OfficeService officeService;
    private UserService userService;



    public GetRestController(OrganizationService organizationService, OfficeService officeService, UserService userService) {
        this.organizationService = organizationService;
        this.officeService = officeService;
        this.userService = userService;
    }


    @GetMapping("/show/organizations")
    public List<Organization> showOrg(){
        List<Organization> showOrg = organizationService.listOrganizations();
        return showOrg;
    }

    @GetMapping("/show/organization/{id}")
    public Organization showOneOrg(@PathVariable("id") Long id) {
       return organizationService.getById(id);
    }

    @GetMapping("/show/offices")
    public List<Office> officeList(){
        return officeService.listOffice();
    }

    @GetMapping("/show/office/{id}")
    public Office showOneOffice(@PathVariable("id") Long id){
        return officeService.getById(id);
    }

    @GetMapping("/show/users")
    public List<User> userList(){
        return userService.list();
    }
    @GetMapping("/show/user/{id}")
    public User showOneuser(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
