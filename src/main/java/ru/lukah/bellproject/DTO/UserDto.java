package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Validated
public class UserDto {
    @NotEmpty(message = "not must be empty")
    private Long id;
    @NotEmpty(message = "not must be empty")
    private long officeId;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String firstName;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String lastName;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String middleName;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String position;
    @NotEmpty(message = "not must be empty")
    @Size(max = 20)
    private String phone;
    @NotEmpty(message = "not must be empty")
    @Size(max = 50)

    @NotEmpty(message = "not must be empty")
    private boolean isIdetified;

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", officeId=" + officeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", isIdetified=" + isIdetified +
                '}';
    }
}
