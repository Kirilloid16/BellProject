package ru.lukah.bellproject.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class restController {
    @GetMapping("/show/organizations")
    public String showOrg(Model model){
        return "showOrg";
    }

    @GetMapping("/show/organization/{id}")
    public  String showOrgId(@PathVariable("id")int id){
        return null;
    }

    @PatchMapping("update/organization/{id}/update")
    public String updateOrgId(@PathVariable("id")int id){
        return null;
    }
    @PostMapping("/organization/post")
    public String PostOrganization(){
            return null;
    }

    @GetMapping("/show/office")
    public String showOffice(Model model){
        return "showOffice";
    }

    @GetMapping("/show/office/{id}")
    public  String showOfficeId(@PathVariable("id")int id){
        return null;
    }

    @PatchMapping("update/office/{id}/update")
    public String updateOfficeId(@PathVariable("id")int id){
        return null;
    }
    @PostMapping("/office/post")
    public String PostOffice(){
        return null;
    }
    @GetMapping("/show/user")
    public String showUser(Model model){
        return "showUser";
    }

    @GetMapping("/show/user/{id}")
    public  String showUserId(@PathVariable("id")int id){
        return null;
    }

    @PatchMapping("update/user/{id}/update")
    public String updateUserId(@PathVariable("id")int id){
        return null;
    }
    @PostMapping("/user/post")
    public String PostUser(){
        return null;
    }
}
