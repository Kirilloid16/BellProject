package ru.lukah.bellproject.Model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "Office")
//public class Office {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "orgId",referencedColumnName = "id")
//    private Organization organization;
//    @Column(name = "name",nullable = false,length = 40)
//    private String name;
//    @Column(name = "address",length = 150,nullable = false)
//    private String address;
//    @Column(name = "phone",length = 30,nullable = false)
//    private String phone;
//    @Column(name = "isActive",length = 50,nullable = false)
//    private boolean isActive;
//
//
//    public Office() {
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public boolean getIsActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean active) {
//        isActive = active;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Office(String name, String address, String phone, boolean isActive, Organization organization) {
//        this.name = name;
//        this.address = address;
//        this.phone = phone;
//        this.isActive = isActive;
//        this.organization = organization;
//    }
//}
