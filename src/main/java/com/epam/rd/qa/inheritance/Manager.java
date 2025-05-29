package com.epam.rd.qa.inheritance;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }

    @Override
    public String getDetails() {
        return "Manager: " + name + ", team size: " + teamSize;
    }
}
