public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
        this.bonus = 0;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero");
        }
        this.bonus = bonus;
    }

    public double toPay() {
        return salary + bonus;
    }
}


public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, double salary, int percent) {
        super(name, salary);
        setPercent(percent);
    }

    private void setPercent(int percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Percent must be >= 0");
        }
        this.percent = percent;
    }

    @Override
    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero");
        }
        double adjustedBonus = bonus;
        if (percent > 200) {
            adjustedBonus *= 3;
        } else if (percent > 100) {
            adjustedBonus *= 2;
        }
        super.setBonus(adjustedBonus);
    }
}


public class Manager extends Employee {
    private int clientAmount;

    public Manager(String name, double salary, int clientAmount) {
        super(name, salary);
        setClientAmount(clientAmount);
    }

    private void setClientAmount(int clientAmount) {
        if (clientAmount < 0) {
            throw new IllegalArgumentException("Client amount must be >= 0");
        }
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero");
        }
        double adjustedBonus = bonus;
        if (clientAmount > 150) {
            adjustedBonus += 1000;
        } else if (clientAmount > 100) {
            adjustedBonus += 500;
        }
        super.setBonus(adjustedBonus);
    }
}


public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null) {
            throw new IllegalArgumentException("Employees array must not be null");
        }
        for (Employee e : employees) {
            if (e == null) {
                throw new IllegalArgumentException("Employee in array must not be null");
            }
        }
        this.employees = employees;
    }

    public void giveEverybodyBonus(double companyBonus) {
        for (Employee e : employees) {
            e.setBonus(companyBonus);
        }
    }

    public double totalToPay() {
        double total = 0;
        for (Employee e : employees) {
            total += e.toPay();
        }
        return total;
    }

    public String nameMaxSalary() {
        if (employees.length == 0) {
            return null;
        }
        Employee maxEmp = employees[0];
        for (Employee e : employees) {
            if (e.toPay() > maxEmp.toPay()) {
                maxEmp = e;
            }
        }
        return maxEmp.getName();
    }
}
