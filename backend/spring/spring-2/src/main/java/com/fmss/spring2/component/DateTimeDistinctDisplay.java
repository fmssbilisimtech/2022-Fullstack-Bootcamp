package com.fmss.spring2.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateTimeDistinctDisplay {
    public DateTimeDistinctDisplay()
    {
        System.out.println("DateTimeDistinctDisplay.DateTimeDistinctDisplay()");
    }

    @PostConstruct
    public void displayDate()
    {
        var today = LocalDate.now();
        var nowText = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(today);

        System.out.println(nowText);
    }

    @PostConstruct
    public void displayTime()
    {
        var now = LocalTime.now();
        var nowText = DateTimeFormatter.ofPattern("hh:mm:ss").format(now);

        System.out.println(nowText);
    }
}
