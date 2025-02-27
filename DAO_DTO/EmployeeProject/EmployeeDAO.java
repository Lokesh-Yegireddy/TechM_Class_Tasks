package DAO_DTO.EmployeeProject;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(EmployeeDTO employee);
    void removeEmployee(int employeeId);
    void displayEmployeeData();
}