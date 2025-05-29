public class Manager extends Employee {
    private int experience;
    private int numberOfSubordinates;

    public Manager(String name, int experience, int numberOfSubordinates) {
        super(name, 500 + 20 * experience + 10 * numberOfSubordinates);
        if (experience < 0 || numberOfSubordinates < 0) {
            throw new IllegalArgumentException("Experience and subordinates must be non-negative.");
        }
        this.experience = experience;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public void setBonus(double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus must be greater than zero.");
        }
        if (numberOfSubordinates > 150) {
            super.setBonus(bonus + 1000);
        } else if (numberOfSubordinates > 100) {
            super.setBonus(bonus + 500);
        } else {
            super.setBonus(bonus);
        }
    }

    public int getExperience() {
        return experience;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}