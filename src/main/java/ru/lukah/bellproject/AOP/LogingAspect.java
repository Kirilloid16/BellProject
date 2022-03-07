//package ru.lukah.bellproject.AOP;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LogingAspect {
//    @Before("execution(* ru.lukah.bellproject.DAO.Organization.OrganizationDaoImpl.allOrganizations())")
//    public void beforeOrganizationDAO(){
//        System.out.println("до срабатывания дао");
//    }
//    @After("execution(* ru.lukah.bellproject.DAO.Organization.OrganizationDaoImpl.allOrganizations())")
//    public void afterOrganizationDAO(){
//        System.out.println("после срабатывания дао");
//    }
//    @Before("execution(* ru.lukah.bellproject.Service.OrganizationService.OrganizationServiceImpl.listOrganizations())")
//    public void beforeOrganizationService(){
//        System.out.println("до срабатывания сервиса");
//    }
//    @After("execution(* ru.lukah.bellproject.Service.OrganizationService.OrganizationServiceImpl.listOrganizations())")
//    public void afterOrganizationService(){
//        System.out.println("после срабатывания сервиса");
//    }
//
//}
