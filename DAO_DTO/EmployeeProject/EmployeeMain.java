package DAO_DTO.EmployeeProject;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO_Implementation();

        // Adding Employees
        EmployeeDTO emp1 = new EmployeeDTO(101, "John Doe", 50000);
        EmployeeDTO emp2 = new EmployeeDTO(102, "Jane Smith", 60000);
        employeeDAO.addEmployee(emp1);
        employeeDAO.addEmployee(emp2);

        // Displaying Employees
        System.out.println("\nEmployee List:");
        employeeDAO.displayEmployeeData();

        // Removing an Employee
        employeeDAO.removeEmployee(101);

        // Displaying Employees after Removal
        System.out.println("\nEmployee List after Removal:");
        employeeDAO.displayEmployeeData();
    }
}
