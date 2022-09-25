//  EMPLOYEE (CLASS)

//  A class named Employee includes three private instance variables,
//  first name (string), last name (string), and monthly salary (double).
//  A constructor initializes the three instance variables. A set and
//  get method is provided for each instance variable. If the monthly
//  salary is not positive, the value is not set. 

public class Employee
{
	// Instance variables
	private String firstName;
	private String lastName;
	private Double monthlySalary;
	
	//---------------------------------------------------
	// CONSTRUCTOR
	// Initializes the variables with the parameter name
	//---------------------------------------------------
    public Employee(String firstName, String lastName, Double monthlySalary)
    {
    	// Assigns name to instance variable name
    	this.firstName = firstName;			// sets to null
    	this.lastName = lastName;			// sets to null
    	this.monthlySalary = monthlySalary;	// sets to 0.0
    	
    	// Validate that the salary is greater than 0.0; if it is not,
    	// instance variable salary keeps its default initial value of 0.0
    	if (monthlySalary > 0.0)
    	{
    		// assign it to instance variable salary
    		monthlySalary = 0.0;
    	}
    }
    //--------------------------------------------
    // METHODS
    // Stores the first and last names, along with
    // the calculations to monthlySalary
    //--------------------------------------------
    public String getFirstName()
    {
    	return firstName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    public Double getYearlySalary()
    {
    	return monthlySalary * 12;
    }
    // for retrieving the yearly salary after raise
    public Double getRaise()
    {
    	// 20% raise calculation to monthly
    	double raise = monthlySalary * .2; 
    	// returns yearly salary after the raise
    	return (monthlySalary + raise) * 12;
    }
}