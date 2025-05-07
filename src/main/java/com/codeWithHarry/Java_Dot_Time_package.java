package com.codeWithHarry;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java_Dot_Time_package {
    public static void main(String[] args) {
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);

//        LocalTime lt = LocalTime.now();
//        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy, hh:mm:ss");
        String myDate = ldt.format(dtf);
        System.out.println(myDate);
    }
}
