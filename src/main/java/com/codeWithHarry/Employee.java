package com.codeWithHarry;

public class Employee {
    private int salary;
    String name;


    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        if (this.salary == 0){
            this.salary = salary;
        }else {
            System.out.println("Salary can be set only once.");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
