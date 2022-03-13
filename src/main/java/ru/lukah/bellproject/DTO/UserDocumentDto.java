package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Validated
public class UserDocumentDto {

    @NotEmpty(message = "not must be empty")
    private int docNumber;
    @NotEmpty(message = "not must be empty")
    private Date docDate;

    @Override
    public String toString() {
        return "DocumentDto{" +
                ", docNumber=" + docNumber +
                ", docDate=" + docDate +
                '}';
    }
}
