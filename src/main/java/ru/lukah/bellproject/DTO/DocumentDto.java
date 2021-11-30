package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Validated
public class DocumentDto {
    @NotEmpty(message = "not must be empty")
    private Long id;
    @NotEmpty(message = "not must be empty")
    @Size(max = 50)
    private String docName;
    @NotEmpty(message = "not must be empty")
    private int docCode;
    @NotEmpty(message = "not must be empty")
    private int docNumber;
    @NotEmpty(message = "not must be empty")
    private Date docDate;

    @Override
    public String toString() {
        return "DocumentDto{" +
                "id=" + id +
                ", docName='" + docName + '\'' +
                ", docCode=" + docCode +
                ", docNumber=" + docNumber +
                ", docDate=" + docDate +
                '}';
    }
}
