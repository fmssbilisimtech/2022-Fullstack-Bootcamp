package com.fmss.spring2.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateTimeDisplay {
    public DateTimeDisplay()
    {
        System.out.println("DateTimeDisplay.DateTimeDisplay()");
    }

    @PostConstruct
    public void displayDateTime()
    {
        var now = LocalDateTime.now();
        var nowText = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(now);

        System.out.println(nowText);
    }
}
