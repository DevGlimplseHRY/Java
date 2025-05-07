package com.codeWithHarry;

import java.util.Date;

public class Date_And_Time {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
        System.out.println("Get time: " + (d.getTime()));
        System.out.println("Now: " + d);
        System.out.println("Current time in milliseconds: " + System.currentTimeMillis());
        System.out.println("Year passed from 1970: " + (System.currentTimeMillis() / 1000/3600/24/365));
    }
}
