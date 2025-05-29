public abstract class Employee {
    private String name;
    private int experience;

    protected Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public abstract int getSalary();
}
