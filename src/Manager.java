public class Manager extends Employee {
    private int clientAmount;

    public Manager(String name, double salary, int clientAmount) {
        super(name, salary);
        if (clientAmount < 0) {
            throw new IllegalArgumentException("Client amount must be greater than or equal to zero.");
        }
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero.");
        }
        if (clientAmount > 150) {
            super.setBonus(bonus + 1000);
        } else if (clientAmount > 100) {
            super.setBonus(bonus + 500);
        } else {
            super.setBonus(bonus);
        }
    }
}