package com.assignments;

public class EmployeeGroups {

	public static void main(String[] args) {
		
		// Create the object of employee class
		
		 Employee obj = new Employee();
		 
		 // create the two array 
		 
		 String [] emp = {obj.empNames[0],obj.empNames[1],obj.empNames[2]};
		 
		 int [] ids = {obj.empIds[0],obj.empIds[1],obj.empIds[2]};
		 
		 // print the employee nmae and ids
		 
		 System.out.println("Employee Name:" + emp[0] + "," + "Employee Id:" + ids[0]);
		 
		 System.out.println("Employee Name:" + emp[1] + "," + "Employee Id:" + ids[1]);
		 
		 System.out.println("Employee Name:" + emp[2] + "," + "Employee Id:" + ids[2]);
		 
	

	}

}
