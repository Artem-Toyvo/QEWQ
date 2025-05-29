package com.epam.rd.qa.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testSalesPersonSalary() {
        Employee e = new SalesPerson("John", 5);
        assertEquals(250, e.getSalary());
    }

    @Test
    public void testManagerSalary() {
        Employee e = new Manager("Alice", 3, 4);
        assertEquals(500 + 20 * 3 + 10 * 4, e.getSalary());
    }

    @Test
    public void testSalesPersonNameAndExperience() {
        Employee e = new SalesPerson("Bob", 10);
        assertEquals("Bob", e.getName());
        assertEquals(10, e.getExperience());
    }

    @Test
    public void testManagerNameExperienceAndSubordinates() {
        Manager m = new Manager("Jane", 7, 10);
        assertEquals("Jane", m.getName());
        assertEquals(7, m.getExperience());
        assertEquals(10, m.getNumberOfSubordinates());
    }

    @Test
    public void testManagerSalaryWithZeroExperienceAndSubordinates() {
        Employee e = new Manager("Zero", 0, 0);
        assertEquals(500, e.getSalary());
    }

    @Test
    public void testSalesPersonSalaryWithZeroExperience() {
        Employee e = new SalesPerson("Newbie", 0);
        assertEquals(200, e.getSalary());
    }
}
