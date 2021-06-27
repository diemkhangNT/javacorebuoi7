package vn.plusplus.edu.activity71;

public class Test {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.inputEmployee();
        System.out.println("Thông tin của tất cả nhân viên: ");
        employeeManagement.outputEmployee();
        System.out.println("Nhân viên có lương cao nhất: "+employeeManagement.findESmax());
        System.out.println("Nhân viên có lương thấp nhất: "+employeeManagement.findESmin());
    }
}
