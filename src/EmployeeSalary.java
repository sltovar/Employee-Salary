//		EMPLOYEE SALARY

public class EmployeeSalary
{

	public static void main(String[] args)
    {
		
		// Print output statement
		System.out.println("This program uses classes and objects to display employees salaries.");
		
		// Assigns names and monthly salaries to two Employee objects
		Employee employee1 = new Employee("John", "Doe", 2875.00);
		Employee employee2 = new Employee("Jane", "Doe", 3150.75);
	   
		
		// Displays the initial yearly salary of each Employee object
		System.out.printf("Employee 1: %s %s; Yearly Salary: $%.2f%n", 
				employee1.getFirstName(), employee1.getLastName(),
				employee1.getYearlySalary());
		System.out.printf("Employee 2: %s %s; Yearly Salary: $%.2f%n",
				employee2.getFirstName(), employee2.getLastName(),
				employee2.getYearlySalary()); 
		
		// Prints a blank line
		System.out.println();
		// Print output statement
		System.out.println("Increasing employee salaries by 20%...");
		
		// Displays the adjusted yearly salary of each Employee object
		System.out.printf("%s %s Yearly Salary: $%.2f%n",
				employee1.getFirstName(), employee1.getLastName(),
				employee1.getRaise());
		System.out.printf("%s %s Yearly Salary: $%.2f%n",
				employee2.getFirstName(), employee1.getLastName(),
				employee2.getRaise());
    } // End of the main method

}
