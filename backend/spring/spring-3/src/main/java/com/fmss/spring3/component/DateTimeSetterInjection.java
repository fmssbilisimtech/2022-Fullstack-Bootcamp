package com.fmss.spring3.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DateTimeSetterInjection {
    private DateTime m_dateTime;

    @Autowired
    public void setDateTime(DateTime dateTime)
    {
        m_dateTime = dateTime;
    }

    @PostConstruct
    public void displayDateTime()
    {
        System.out.printf("DateTimeSetterInjection:%s%n", m_dateTime);
    }
}
