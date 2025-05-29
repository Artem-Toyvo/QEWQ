package com.epam.rd.qa.inheritance;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Employee: " + name;
    }
}
