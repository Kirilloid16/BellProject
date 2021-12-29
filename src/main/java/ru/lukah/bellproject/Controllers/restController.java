package ru.lukah.bellproject.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/showOrg")
    public String showOrg(Model model){
        return "showOrg";
    }

    @GetMapping("{id}")
    public  String showOrgId(){
        return null;
    }
    
}
