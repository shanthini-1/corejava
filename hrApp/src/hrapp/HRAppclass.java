package hrapp;

/**
 * 
 * @author shan3102
 * created on : 07 apr 2022
 */
public class HRAppclass {
 

	public static void main(String[] args) {
		System.out.println("HRApp Starts");
	
		Employee e1 =new Employee(231,"jerry",21000);
		Employee e2 =new Employee(124,"adam",22050);
//		System.out.println("emp"+e1);
//		System.out.println("emp"+e2);
		
		Department dept=new Department("Education");
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(new Employee(623,"jill",2366));
		
		Employee[] emps = dept.getEmployees();
		for(Employee emp :emps) {
			System.out.println("Emp "+emp);
		}
		System.out.println("Total " +dept.getTotalSalary());
		System.out.println("Average " +dept.getAverageSalary());
		System.out.println("Emp " +dept.getEmployeeById(231));
	}

}
