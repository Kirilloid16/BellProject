package ru.lukah.bellproject.DTO;

import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Validated
public class OfficeDto {
    @NotEmpty(message = "not must be empty")
    private Long id;
    @NotEmpty(message = "not must be empty")
    private String orgId;
    @NotEmpty(message = "not must be empty")
    @Size(max = 40)
    private String name;
    @NotEmpty(message = "not must be empty")
    @Size(max = 130)
    private String address;
    @Size(max = 30)
    private String phone;
    private boolean isActive;

    @Override
    public String toString() {
        return "OfficeDto{" +
                "id=" + id +
                ", orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
