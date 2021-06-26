package vn.plusplus.edu.activity71;

public class ParttimeEmployee extends Employee {
    long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift; // So ca lam viec
    private long baseSalary; // luong theo ca

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }
    public ParttimeEmployee(){}
    public ParttimeEmployee( int totalWorkingShift, long baseSalary) {
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public ParttimeEmployee(String name, int age, String identificationNumber,
                            long MEAL_ALLOWANCE, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        this.MEAL_ALLOWANCE = MEAL_ALLOWANCE;
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }
}
