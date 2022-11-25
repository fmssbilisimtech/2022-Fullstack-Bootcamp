package com.fmss.spring3.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class DateTimeConfig {
    @Bean("birthDate")
    public LocalDate getBirthDate()
    {
        return LocalDate.of(1976, 9, 10);
    }

    @Bean
    public LocalDate createDate() //Örnek amaçlı bean'e isim verilmedi. Normalde verilmesi daha uygundur
    {
        System.out.println("createDate");
        return LocalDate.now();
    }

    @Bean
    @Scope("prototype")
    public LocalTime createTime()
    {
        System.out.println("createTime");
        return LocalTime.now();
    }
}
