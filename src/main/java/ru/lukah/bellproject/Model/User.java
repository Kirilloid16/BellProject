package ru.lukah.bellproject.Model;

import javax.persistence.*;


@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "officeId", nullable = false)
    @JoinColumn()
    private long officeId;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "middleName", nullable = false)
    private String middleName;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "sitizenShipName", nullable = false)
    private String sitizenShipName;
    @Column(name = "sitizenShipCode", nullable = false)
    private String sitizenShipCode;

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSitizenShipName() {
        return sitizenShipName;
    }

    public void setSitizenShipName(String sitizenShipName) {
        this.sitizenShipName = sitizenShipName;
    }

    public String getSitizenShipCode() {
        return sitizenShipCode;
    }

    public void setSitizenShipCode(String sitizenShipCode) {
        this.sitizenShipCode = sitizenShipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
