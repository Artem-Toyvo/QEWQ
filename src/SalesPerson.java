public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, double salary, int percent) {
        super(name, salary);
        if (percent < 0) {
            throw new IllegalArgumentException("Percent must be greater than or equal to zero.");
        }
        this.percent = percent;
    }

    @Override
    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero.");
        }
        if (percent > 200) {
            super.setBonus(bonus * 3);
        } else if (percent > 100) {
            super.setBonus(bonus * 2);
        } else {
            super.setBonus(bonus);
        }
    }
}