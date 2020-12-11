/*
 * Create an API for Sales and Production dept.
1. When an employee joins, System should generate empid with 
dept code.
2. Sales emp,after achieving sales target, is eligible 
for commission.
3. Production emp also have production target, after 
completing he is also eligible for bonus.
4. No one should able to modify employee name changing module.
5. Each employee must have targets which will declare at 
department level.
6. Production dept must have overtime functionality.
7. All employees must have total working hours and its 
respective functionality.
8. In case of Critical/important condition, the user 
of API MUST pay attention.
==============================================
[ NOTE - Decide interfaces and class by your own ]
After creating base modules (Classes & interfaces), 
accepts 3 employees details and store in an array
 */



public abstract class Employee {

	// Declare variables 
	protected int empID; 
	protected static String name; 
	protected static String city; 
	protected static String state;
	protected static String phoneNumber; 
	protected static String email; 
	protected double dailyHours = 0; 
	protected double totalWorkingHours = 0; 
	
	
	// Getters/Setters 
	protected int getEmpID() {
		return empID;
	}

	protected void setEmpID(int empID) {
		this.empID = empID;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	protected String getState() {
		return state;
	}

	protected void setState(String state) {
		this.state = state;
	}

	protected String getPhoneNumber() {
		return phoneNumber;
	}

	protected void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected double getDailyHours() {
		return dailyHours;
	}

	protected void setDailyHours(double dailyHours) {
		this.dailyHours = dailyHours;
	}

	protected double getTotalWorkingHours() {
		return totalWorkingHours;
	}

	protected void setTotalWorkingHours(double totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}

	// Constructor of an employee 
	public Employee (int empID, String name, String city, String
			state, String phoneNumber, String email, double
			dailyHours, double totalWorkingHours) {
		this.empID = empID; 
		Employee.name = name; 
		Employee.city = city; 
		Employee.state = state; 
		Employee.phoneNumber = phoneNumber;
		Employee.email = email; 
		this.dailyHours = dailyHours; 
		this.totalWorkingHours = totalWorkingHours; 
	}
	
	     // Method to calculate working hours 
	    double CalcWorkingHours() {
		// Empty method that must be implemented by all
		// child classes/departments 
		// calculate and return total working hours 
		return totalWorkingHours;
	}
	
	    // Method that adds a new hire 
	public Employee[] newHire() {
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
