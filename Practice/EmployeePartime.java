package Practice;

public class EmployeePartime extends SalaryPolicy{
    private float rate;

    public EmployeePartime(float baseSalary) {
        super(baseSalary);
        this.rate = (float) 2.5;
    }

    public EmployeePartime(float baseSalary, float rate) {
        super(baseSalary);
        this.rate = rate;
    }

    @Override
    public float getSalary() {
        return rate*super.baseSalary;
    }
}
