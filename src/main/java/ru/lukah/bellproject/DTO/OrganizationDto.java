package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Validated
public class OrganizationDto {
    @NotEmpty(message = "not must be empty")
    private Long id;
    @NotEmpty(message = "not must be empty")
    @Size(max = 40)
    private String name;
    @NotEmpty(message = "not must be empty")
    @Size(max = 40)
    private String fullName;
    @Size(max = 10)
    private String inn;
    @Size(max = 9)
    private String kpp;
    @Size(max = 130)
    private String address;
    @Size(max = 30)
    private String phone;
    private String isActive;

    @Override
    public String toString() {
        return "OrganizationDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
