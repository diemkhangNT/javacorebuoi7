package vn.plusplus.edu.activity71;

public abstract class Employee {
    private String name;
    private int age;
    private String identificationNumber;

    public Employee(){}
    public Employee(String name, int age, String identificationNumber) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract int getWorkingCount();
    public long calculateSalary(){
        return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

}
