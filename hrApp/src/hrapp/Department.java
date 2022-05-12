package hrapp;

public class Department {
	private String Department_name;

	private Employee[] employees = new Employee[10];

	private int lastAddedEmloyeeIndex = -1;

//  constructor
	public Department(String Department_name) {
		this.Department_name = Department_name;
	}

	public String getDepartment_name() {
		return Department_name;
	}

	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}

	public void addEmp(Employee anEmployee) {
		/**
		 * 
		 */
		if (lastAddedEmloyeeIndex < employees.length) {
			lastAddedEmloyeeIndex++;
			employees[lastAddedEmloyeeIndex] = anEmployee;
		}
	}

	public Employee[] getEmployees() {
		Employee[] actualEmployees = new Employee[lastAddedEmloyeeIndex + 1];
		for (int i = 0; i < actualEmployees.length; i++) {
			actualEmployees[i] = employees[i];
		}
		return actualEmployees;
	}

	public int getEmployeeCount() {
		/**
		 * 
		 */
		return lastAddedEmloyeeIndex++;
	}

	public Employee getEmployeeById(int empId) {
		/*
		  
		  
		  Employee result =null; 
		  for (Employee emp:employees) {
		   if(emp.getEmployee_id()==(empId)) 
		    	{ result =emp; 
		    		break; 
		   		}
		   } 
		   return result;
		 
		 */

		for (Employee emp : employees) {
			if (emp!= null){
			if (emp.getEmployee_id() == (empId)) {
				return emp;
			}
			}
		}
		return null;
	}
	public double getTotalSalary() {
		/*
		 */
		double totalSalary =0.0;
		for (int i=0;i<=lastAddedEmloyeeIndex;i++) {
			totalSalary+=employees[i].getEmployee_salary();
		}
		return totalSalary;
	}
	public double getAverageSalary() 
	{
		/*
		*/
		if(lastAddedEmloyeeIndex>-1){
			return getTotalSalary()/(lastAddedEmloyeeIndex+1);
		}
		return 0.0;
	}

}
