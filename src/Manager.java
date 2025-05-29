package com.epam.rd.qa.inheritance;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int experience, int numberOfSubordinates) {
        super(name, experience);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        return 500 + 20 * getExperience() + 10 * getNumberOfSubordinates();
    }
}
