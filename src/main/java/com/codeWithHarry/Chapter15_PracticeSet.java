package com.codeWithHarry;
import java.time.LocalDate;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Chapter15_PracticeSet {
    public static void main(String[] args) {
        /* Question 1

        ArrayList<String> student = new ArrayList<>();
        student.add("Suresh");
        student.add("Mahesh");
        student.add("Naresh");
        student.add("Dipesh");
        student.add("af");
        student.add("sa");
        student.add("dd");
        student.add("gg");
        student.add("hh");
        student.add("ff");

//        System.out.println(student);
        for (String names: student){
            System.out.print(names + " ");
        }

         */

//        Question 2

        Date d1 = new Date();
//        System.out.println("Time " + d1.getTime());
        System.out.println(d1.getHours() + ":" + d1.getMinutes() + ":" + d1.getSeconds());

//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yyyy");
//        String formattedDate =  df.format(d);
//        System.out.println(formattedDate);


//        Question 3


        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

    }
}