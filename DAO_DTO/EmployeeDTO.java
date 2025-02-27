package DAO_DTO;

public class EmployeeDTO {
   private String EmployeeName;
   private int EmployeeId;
   private double EmployeeSalary;
   
   public EmployeeDTO(int EmployeeId,String EmployeeName,double EmployeeSalary)
   {
	   this.EmployeeId=EmployeeId;
	   this.EmployeeName=EmployeeName;
	   this.EmployeeSalary=EmployeeSalary;
	   
   }

public String getEmployeeName() {
	return EmployeeName;
}

public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

public int getEmployeeId() {
	return EmployeeId;
}

public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}

public double getEmployeeSalary() {
	return EmployeeSalary;
}

public void setEmployeeSalary(double employeeSalary) {
	EmployeeSalary = employeeSalary;
}
   

}
