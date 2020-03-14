package Practice;

abstract public class SalaryPolicy {
    protected float baseSalary;

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract public float getSalary();

}
