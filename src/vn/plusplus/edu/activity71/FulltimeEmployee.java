package vn.plusplus.edu.activity71;

public class FulltimeEmployee extends Employee {
    final long MEAL_ALLOWANCE = 2000000;
    private int totalWorkingDays; // So ngay lam viec
    private long dailySalary; // Luong theo ngay

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }
    public FulltimeEmployee(){}
    public FulltimeEmployee( int totalWorkingDays, long dailySalary) {
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee(String name, int age, String identificationNumber,
                             int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNumber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

}
