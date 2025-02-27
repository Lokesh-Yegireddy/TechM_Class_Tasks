package DAO_DTO.EmployeeProject;

public class EmployeeDTO {
   private String employeeName;
   private int employeeId;
   private double employeeSalary;

   // Constructor
   public EmployeeDTO(int employeeId, String employeeName, double employeeSalary) {
       this.employeeId = employeeId;
       this.employeeName = employeeName;
       this.employeeSalary = employeeSalary;
   }

   // Getters and Setters
   public String getEmployeeName() {
       return employeeName;
   }

   public void setEmployeeName(String employeeName) {
       this.employeeName = employeeName;
   }

   public int getEmployeeId() {
       return employeeId;
   }

   public void setEmployeeId(int employeeId) {
       this.employeeId = employeeId;
   }

   public double getEmployeeSalary() {
       return employeeSalary;
   }

   public void setEmployeeSalary(double employeeSalary) {
       this.employeeSalary = employeeSalary;
   }
}
