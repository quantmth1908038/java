package Practice;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        EmployeeFullTime f1 = new EmployeeFullTime(1000000);
        EmployeePartime p2 = new EmployeePartime(1000000);

        System.out.println(f1.getSalary());
        System.out.println(p2.getSalary());

        SalaryPolicy s1 = new EmployeeFullTime(1500000);
        SalaryPolicy s2 = new EmployeePartime(1500000);

        System.out.println(s1.getSalary());
        System.out.println(s2.getSalary());

    }

}
