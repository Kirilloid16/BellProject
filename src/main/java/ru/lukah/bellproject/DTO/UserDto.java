package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;



@Validated
public class UserDto {
    private long officeId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String phone;


    @Override
    public String toString() {
        return "UserDto{" +

                ", officeId=" + officeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
