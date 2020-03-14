package Practice;

public class EmployeeFullTime extends SalaryPolicy{
    private float rate;

    public EmployeeFullTime(float baseSalary) {
        super(baseSalary);
        this.rate = 4;
    }

    public EmployeeFullTime(float baseSalary, float rate) {
        super(baseSalary);
        this.rate = rate;
    }

    @Override
    public float getSalary() {
        return this.rate*super.baseSalary;
    }
}
