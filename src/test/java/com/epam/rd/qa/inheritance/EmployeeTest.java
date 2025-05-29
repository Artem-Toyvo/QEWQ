package com.epam.rd.qa.inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testManagerIsEmployee() {
        Employee e = new Manager("Alice", 5);
        assertTrue(e instanceof Manager);
    }

    @Test
    public void testSalesPersonIsEmployee() {
        Employee e = new SalesPerson("Bob", 10000.0);
        assertTrue(e instanceof SalesPerson);
    }
}
