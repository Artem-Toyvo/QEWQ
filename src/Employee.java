public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero.");
        }
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero.");
        }
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero.");
        }
        this.bonus = bonus;
    }

    public double toPay() {
        return salary + bonus;
    }
}