package ru.lukah.bellproject.Model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Office")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name",nullable = false,length = 40)
    private String name;
    @Column(name = "address",length = 150,nullable = false)
    private String address;
    @Column(name = "phone",length = 30,nullable = false)
    private String phone;
    @Column(name = "isActive",length = 50,nullable = false)
    private boolean isActive;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "officeId")
    private List<User> userList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
