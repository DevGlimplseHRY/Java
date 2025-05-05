package com.engineeringDigest.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/config/config.xml");
        Vehicle vehicle1 = context.getBean("myVehicle", Vehicle.class);
        System.out.println(vehicle1.getMileage());
        System.out.println(vehicle1.getDiscountMessage());
        System.out.println(vehicle1.getBrandName());

    }
}
