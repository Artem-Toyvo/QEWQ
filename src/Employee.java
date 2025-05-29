public class Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double baseSalary) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary must be non-negative.");
        }
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus must be non-negative.");
        }
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }
}
