package ru.lukah.bellproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import ru.lukah.bellproject.Model.Organization;
import ru.lukah.bellproject.Service.OrganizationService.OrganizationService;

import java.util.List;

@SpringBootTest
class BellProjectApplicationTests {
    @Autowired
    private OrganizationService organizationService;
    @Test
    void contextLoads() {
    }

    @Test
     void test(){
        List<Organization> list = organizationService.listOrganizations();
        Assertions.assertFalse(list.isEmpty());
    }



}
