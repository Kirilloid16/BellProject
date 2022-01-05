package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Organization")
public class Organization {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",length = 50,nullable = false)
    private String name;
    @Column(name ="fullNmane",length = 255,nullable = false)
    private String fullName;
    @Column(name = "inn",nullable = false)
    private String inn;
    @Column(name="kpp",nullable = false)
    private String kpp;
    @Column(name = "address",length = 255,nullable = false)
    private String address;
    @Column(name = "phone",length = 40,nullable = false)
    private String phone;
    @Column(name = "isActive")
    private boolean isActive;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "orgId")
    private List<Office> officeList;

    public Organization() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Organization(Long id, String name, String fullName, String inn, String kpp, String address, String phone, boolean isActive) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
