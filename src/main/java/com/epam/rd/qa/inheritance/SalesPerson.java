package com.epam.rd.qa.inheritance;

public class SalesPerson extends Employee {
    private double salesTarget;

    public SalesPerson(String name, double salesTarget) {
        super(name);
        this.salesTarget = salesTarget;
    }

    @Override
    public String getDetails() {
        return "SalesPerson: " + name + ", target: " + salesTarget;
    }
}
