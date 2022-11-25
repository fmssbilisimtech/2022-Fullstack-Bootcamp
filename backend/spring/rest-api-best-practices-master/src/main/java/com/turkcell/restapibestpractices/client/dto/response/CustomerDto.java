package com.turkcell.restapibestpractices.client.dto.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@Builder
public class CustomerDto {

    private long id;
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty(value = "birth-date")
    private LocalDate birthDate;
    private CityDto city;
    private String email;

}
