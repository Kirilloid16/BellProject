package ru.lukah.bellproject.Controllers;


import org.springframework.web.bind.annotation.*;
import ru.lukah.bellproject.Model.*;
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

    @GetMapping("/show/organizationsss")
    public List<Organization> org(@RequestBody Organization organization){
        return  organizationService.organizations1(organization);

    }
    @GetMapping("/show/officesss")
    public List<Office> officeList1(@RequestBody Office office){
        return officeService.listOffice1(office);
    }
}
