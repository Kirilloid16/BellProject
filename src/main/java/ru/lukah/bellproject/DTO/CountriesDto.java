package ru.lukah.bellproject.DTO;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Validated
public class CountriesDto {
    @NotEmpty(message = "not must be empty")
    private Long id;
    @NotEmpty(message = "not must be empty")
    @Size(max = 50)
    private String name;
    @NotEmpty(message = "not must be empty")
    private int code;

    @Override
    public String toString() {
        return "CountriesDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
