package DAO_DTO.EmployeeProject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO_Implementation implements EmployeeDAO {
    private List<EmployeeDTO> employees = new ArrayList<>();

    @Override
    public void addEmployee(EmployeeDTO employee) {
        employees.add(employee);
        System.out.println("Employee added successfully: " + employee.getEmployeeName());
    }

    @Override
    public void removeEmployee(int employeeId) {
        employees.removeIf(emp -> emp.getEmployeeId() == employeeId);
        System.out.println("Employee with ID " + employeeId + " removed successfully.");
    }

    @Override
    public void displayEmployeeData() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (EmployeeDTO emp : employees) {
                System.out.println("ID: " + emp.getEmployeeId() +
                        ", Name: " + emp.getEmployeeName() +
                        ", Salary: " + emp.getEmployeeSalary());
            }
        }
    }
}
