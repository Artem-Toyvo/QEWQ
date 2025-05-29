package com.epam.rd.qa.inheritance;

public class SalesPerson extends Employee {

    public SalesPerson(String name, int experience) {
        super(name, experience);
    }

    @Override
    public int getSalary() {
        return 200 + 10 * getExperience();
    }
}
