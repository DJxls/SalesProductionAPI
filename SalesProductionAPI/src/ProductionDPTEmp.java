import java.util.Scanner;

public class ProductionDPTEmp extends Employee implements BonusCalculator {

	// Department Code 
	final int PRODUCTIONDPTCODE = 102; 
	// Overtime variable 
	private double overtime = 0;
	
	public ProductionDPTEmp(int empID, String name, String city, String state, String phoneNumber, String email,
			double dailyHours, double totalWorkingHours) {
		super(empID, name, city, state, phoneNumber, email, dailyHours, totalWorkingHours) {
		// TODO Auto-generated constructor stub
	}
		
		
		public Employee[] newHire() {
			
			// new hire form
			Scanner paperWork = new Scanner(System.in); 
			
			System.out.println("Name: ");
			ProductionDPTEmp.name = paperWork.nextLine();
			System.out.println("City: ");
			ProductionDPTEmp.city = paperWork.nextLine(); 
			System.out.println("State: ");
			ProductionDPTEmp.state = paperWork.nextLine(); 
			System.out.println("Phone Number: ");
			ProductionDPTEmp.phoneNumber = paperWork.nextLine(); 
			System.out.println("Email: "); 
			ProductionDPTEmp.email = paperWork.nextLine();
			paperWork.close();
			
			// Gives the new hire an EmployeeID 
			empID = empID++;
			return newHire(); 
		}
		
		 double CalcWorkingHours() {
				totalWorkingHours = totalWorkingHours + dailyHours
						+ overtime; 
				return totalWorkingHours;
			}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public double salesComission(double salesTarget, double bonus) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double productionBonus(double prdTarget, double bonus) {
		// TODO Auto-generated method stub
		return 0;
	}

}
