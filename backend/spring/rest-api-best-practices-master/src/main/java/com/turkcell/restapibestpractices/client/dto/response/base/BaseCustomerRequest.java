package com.turkcell.restapibestpractices.client.dto.response.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.turkcell.restapibestpractices.client.dto.response.CityDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class BaseCustomerRequest {
    @NotBlank(message = "Name cannot empty")
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    private CityDto city;

//    @Size(min = 10, max = 200, message
//            = "Address must be between 10 and 200 characters")
//    private String address;

    @Email(regexp = "^(.+)@(.+)$", message = "Email is not valid. Please follow the example: turkcell@mail.com")
    @NotBlank(message = "Email must not be null")
    private String email;

}
