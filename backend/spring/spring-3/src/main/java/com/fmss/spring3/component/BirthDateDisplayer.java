//package com.fmss.spring3.component;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//@Component
//public class BirthDateDisplayer {
//
//    private final LocalDate m_birthDate;
//
//    public BirthDateDisplayer(@Qualifier("birthDate") LocalDate birthDate)
//    {
//        m_birthDate = birthDate;
//    }
//
//    @PostConstruct
//    public void displayDateTime()
//    {
//        System.out.printf("BirthDate:%s%n", DateTimeFormatter.ofPattern("dd-MM-yyy")
//                .format(m_birthDate));
//    }
//}
