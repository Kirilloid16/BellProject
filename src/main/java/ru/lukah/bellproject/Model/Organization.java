package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name ="fullname")
    private String fullname;
    @Column(name = "inn")
    private String inn;
    @Column(name="kpp")
    private String kpp;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "active")
    private String active;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id")
    private List<Office> officeList;

    public Organization() {
    }

    public Organization(String name, String fullname, String inn, String kpp, String address,
                        String phone, String active)
    {
        this.name = name;
        this.fullname = fullname;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", active='" + active + '\'' +
                ", officeList=" + officeList +
                '}';
    }
}
