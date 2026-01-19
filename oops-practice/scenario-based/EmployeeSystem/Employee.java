package EmployeeSystem;

public abstract class Employee {

    private final String name;
    private final double salary;
    protected final double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = calculateBonus();
    }

    protected double getSalary() {
        return salary;
    }

    protected abstract double calculateBonus();

    public double getBonus() {
        return bonus;
    }
}
