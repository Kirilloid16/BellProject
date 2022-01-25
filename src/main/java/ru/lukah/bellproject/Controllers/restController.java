package ru.lukah.bellproject.Controllers;


import org.springframework.web.bind.annotation.*;
import ru.lukah.bellproject.DAO.Organization.Organizationdao;
import ru.lukah.bellproject.DTO.OrganizationDto;
import ru.lukah.bellproject.Service.OfficeService.OfficeService;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;
import ru.lukah.bellproject.Service.UserService.UserService;



@RestController
public class restController {
    private final OrganizationService organizationService;
    private final OfficeService officeservice;
    private final UserService userService;


    public restController(OrganizationService organizationService, OfficeService officeservice, UserService userService, Organizationdao organizationdao) {
        this.organizationService = organizationService;
        this.officeservice = officeservice;
        this.userService = userService;

    }


//    @GetMapping("/show/organizations")
//    public String showOrg(@ModelAttribute("organization") @Valid OrganizationDto organization, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//
//        }
//        return "showOrg";
//    }

    @GetMapping("/show/organization/{id}")
    public OrganizationDto showOrgId(@PathVariable("id") int id) {
       OrganizationDto organization = organizationService.getById(id);
        return organization ;
    }

}
//    @GetMapping("organization/{id}/update")
//    public String EditOrgId(@PathVariable("id")int id, @ModelAttribute("organizationDto")
//    @Valid OrganizationDto organizationDto, BindingResult bindingResult){
//        return null;
//    }
//
//    @PatchMapping("organization/{id}/update")
//    public String updateOrgId(@PathVariable("id")int id, @ModelAttribute("organizationDto")
//    @Valid OrganizationDto organizationDto, BindingResult bindingResult){
//        return null;
//    }
//    @PostMapping("/organization/post")
//    public String PostOrganization(@PathVariable("id") int id, @Valid OrganizationDto organizationDto)
//    {
//            return "updateOrg";
//    }
//
//
//    @GetMapping("/show/office")
//    public String showOffice(Model model){
//        return "showOffice";
//    }
//
//    @GetMapping("/show/office/{id}")
//    public  String showOfficeId(@PathVariable("id")int id){
//        return null;
//    }
//
//    @PatchMapping("update/office/{id}/update")
//    public String updateOfficeId(@PathVariable("id")int id){
//        return null;
//    }
//    @PostMapping("/office/post")
//    public String PostOffice(){
//        return null;
//    }
//    @GetMapping("/show/user")
//    public String showUser(Model model){
//        return "showUser";
//    }
//
//    @GetMapping("/show/user/{id}")
//    public  String showUserId(@PathVariable("id")int id){
//        return null;
//    }
//
//    @PatchMapping("update/user/{id}/update")
//    public String updateUserId(@PathVariable("id")int id){
//        return null;
//    }
//    @PostMapping("/user/post")
//    public String PostUser(){
//        return null;
//    }
//}
