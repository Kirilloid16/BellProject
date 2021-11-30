package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
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
    private String docName;
    @NotEmpty(message = "not must be empty")
    private String docNumber;
    @NotEmpty(message = "not must be empty")
    private String docCode;
    @NotEmpty(message = "not must be empty")
    private String docDate;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String sitizenShipName;
    @NotEmpty(message = "not must be empty")
    @Size(max = 30)
    private String sitizenShipCode;
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
                ", docName='" + docName + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", docCode=" + docCode +
                ", docDate=" + docDate +
                ", sitizenShipName='" + sitizenShipName + '\'' +
                ", sitizenShipCode='" + sitizenShipCode + '\'' +
                ", isIdetified=" + isIdetified +
                '}';
    }
}
