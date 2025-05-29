public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null) {
            throw new IllegalArgumentException("Employees array must not be null.");
        }
        for (Employee emp : employees) {
            if (emp == null) {
                throw new IllegalArgumentException("Employee array contains null element.");
            }
        }
        this.employees = employees;
    }

    public void giveEverybodyBonus(double companyBonus) {
        for (Employee emp : employees) {
            emp.setBonus(companyBonus);
        }
    }

    public double totalToPay() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.toPay();
        }
        return total;
    }

    public String nameMaxSalary() {
        if (employees.length == 0) return null;
        Employee max = employees[0];
        for (Employee emp : employees) {
            if (emp.toPay() > max.toPay()) {
                max = emp;
            }
        }
        return max.getName();
    }
}