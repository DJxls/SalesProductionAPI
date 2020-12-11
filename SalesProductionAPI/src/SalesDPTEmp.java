import java.util.Scanner;

public class SalesDPTEmp extends Employee implements BonusCalculator {
	
	// Department Code 
	final int SALESDPTCODE = 101; 

	public SalesDPTEmp(int empID, String name, String city, String state, String phoneNumber, String email,
			double dailyHours, double totalWorkingHours) {
		super(empID, name, city, state, phoneNumber, email, dailyHours, totalWorkingHours);
		// TODO Auto-generated constructor stub
	}

	
	public Employee[] newHire() {
		
		// new hire form
		Scanner paperWork = new Scanner(System.in); 
		
		System.out.println("Name: ");
		SalesDPTEmp.name = paperWork.nextLine();
		System.out.println("City: ");
		SalesDPTEmp.city = paperWork.nextLine(); 
		System.out.println("State: ");
		SalesDPTEmp.state = paperWork.nextLine(); 
		System.out.println("Phone Number: ");
		SalesDPTEmp.phoneNumber = paperWork.nextLine(); 
		System.out.println("Email: "); 
		SalesDPTEmp.email = paperWork.nextLine();
		paperWork.close();
		
		// Gives the new hire an EmployeeID 
		empID = empID++;
		return newHire(); 
	}
	
	     double CalcWorkingHours() {
		totalWorkingHours = totalWorkingHours + dailyHours; 
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
