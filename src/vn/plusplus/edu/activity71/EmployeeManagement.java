package vn.plusplus.edu.activity71;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagement {
    private int n; // tong so nhan vien
    private Employee[] employees; // mang danh sach cac nhan vien

    public EmployeeManagement(){}

    public EmployeeManagement(int n) {
        this.n = n;
    }
    // Nhập thông tin cho từng nhân viên
    // Đưa ra lựa chọn để nhập nhân viên fulltime/parttime
    public void inputEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tổng số nhân viên: ");
        n = scanner.nextInt();
        scanner.nextLine();
        employees = new Employee[n];
//        Employee employee = new Employee() {
//            @Override
//            public long getMealAllowance() {
//                return 0;
//            }
//
//            @Override
//            public long getSalaryRate() {
//                return 0;
//            }
//
//            @Override
//            public int getWorkingCount() {
//                return 0;
//            }
//        };
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee();
        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();
        for(int i =0;i<employees.length;i++){
            System.out.print("Nhập tên NVien: ");
            String name = scanner.nextLine();
            System.out.print("Nhập số tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập số CMT: ");
            String identificationNumber = scanner.nextLine();

            System.out.print("Chọn loại nhân viên (F là Fulltime, ngược lại là Parttime): ");
            String type = scanner.nextLine();
            char c = type.toUpperCase().charAt(0);
            if(c == 'F'){
                System.out.print("Nhập số ngày làm việc: ");
                int totalWorkinrDays = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập lương theo ngày: ");
                long dailySalary = scanner.nextLong();
                scanner.nextLine();
                employees[i] = new FulltimeEmployee(totalWorkinrDays,dailySalary);
                employees[i] = new Employee(name,age,identificationNumber){

                    @Override
                    public long getMealAllowance() {
                        return fulltimeEmployee.MEAL_ALLOWANCE;
                    }

                    @Override
                    public long getSalaryRate() {
                        return dailySalary;
                    }

                    @Override
                    public int getWorkingCount() {
                        return totalWorkinrDays;
                    }
                };
            }else {
                System.out.print("Nhập số ca làm việc: ");
                int totalWorkingShift = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập lương theo ca: ");
                long baseSalary = scanner.nextLong();
                scanner.nextLine();
                employees[i] = new ParttimeEmployee(totalWorkingShift,baseSalary);
                employees[i] = new Employee(name,age,identificationNumber){

                    @Override
                    public long getMealAllowance() {
                        return parttimeEmployee.MEAL_ALLOWANCE;
                    }

                    @Override
                    public long getSalaryRate() {
                        return baseSalary;
                    }

                    @Override
                    public int getWorkingCount() {
                        return totalWorkingShift;
                    }
                };
            }
        }
    }
    public void outputEmployee(){
        for(int i =0;i<employees.length;i++){
            System.out.println("\t"+(i+1)+". Name: "+employees[i].getName()+
                    ", Age: "+employees[i].getAge()+", CMT: "+employees[i].getIdentificationNumber());
            System.out.println("\t\tSalary: "+employees[i].calculateSalary());
        }
    }
    // Tìm nhân viên có tiền lương cao nhất/thấp nhất
    public String findESmax(){
        Employee max = employees[0];
        for(int i=0;i<employees.length;i++){
            if(max.calculateSalary() < employees[i].calculateSalary()){
                max= employees[i];
            }
        }
        return "Name: '"+max.getName()+'\''+", Age: "+max.getAge()+", CMT: "+max.getIdentificationNumber();
    }
    public String findESmin(){
        Employee min = employees[0];
        for(int i=0;i<employees.length;i++){
            if(min.calculateSalary() > employees[i].calculateSalary()){
                min = employees[i];
            }
        }
        return "Name: '"+min.getName()+"\'"+", Age: "+min.getAge()+", CMT: "+min.getIdentificationNumber();
    }
}
