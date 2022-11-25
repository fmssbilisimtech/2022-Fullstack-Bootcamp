package com.fmss.spring3.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype") //default (yani işaretlenmezse) singleton
public class DateTime {
    private final LocalDate m_localDate;
    private final LocalTime m_localTime;

    public DateTime(@Qualifier("createDate") LocalDate localDate, LocalTime localTime)
    {
        System.out.println("DateTime.DateTime(LocalDate localDate, LocalTime localTime)");
        m_localDate = localDate;
        m_localTime = localTime;
    }

    public String getDateStr()
    {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(m_localDate);
    }

    public String getTimeStr()
    {
        return DateTimeFormatter.ofPattern("hh:mm:ss.n").format(m_localTime);
    }

    @Override
    public String toString()
    {
        return this.getDateStr() + " " + this.getTimeStr();
    }
}
