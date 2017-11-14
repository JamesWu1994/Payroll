import java.util.*;

public class Payrolls {
	final int employeeId[] = {5678,3456,7890};
	public int hours[];
	public double payRate[];
	public double wages[];
	static Scanner in = new Scanner(System.in);
	Payrolls()
	 {
	 hours = new int[3];
	 payRate = new double[3];
	 wages = new double[3];
	 }
	 void inputHoursAndPayrate()
	 {

	 System.out.println("Input Hours and Payrate for 3 Employees");
	 for(int i=0;i<3;i++)
	 {
	 System.out.println("Enter Hours for Employee : "+employeeId[i]);
	 hours[i] = in.nextInt();
	 while(hours[i] <0 )
	 {
	 System.out.println("Error! Please enter Hours again");
	 hours[i] = in.nextInt();
	 }

	 System.out.println("payrate"+employeeId[i]);
	 payRate[i] = in.nextDouble();
	 while(payRate[i] <0 || payRate[i]< 6)
	 {
	 System.out.println("Error! Please enter PayRate again");
	 payRate[i] = in.nextDouble();
	 }
	 }
	 }

	 void displayGrossWage()
	 {
	 System.out.println("Gross wages of all 3 Employees :"); 
	 for(int i=0;i<3;i++)
	 {
	 wages[i] = hours[i]*payRate[i];
	 System.out.println("Gross wage of Employee "+employeeId[i]+" : "+wages[i]); 
	 }
	 }

	 double returnWage(int ID)
	 {
	 for(int i=0;i<3;i++)
	 {
	 if(employeeId[i] == ID)
	 {

	 return wages[i];
	 }
	 }
	 return 0;
	 }

	 public static void main(String args[])
	 {
	 Payrolls pay = new Payrolls();
	 pay.inputHoursAndPayrate();
	 pay.displayGrossWage();
	 System.out.println("Enter Employee ID for which you want to get Wgaes : ");
	 int search = in.nextInt();
	 double wage = pay.returnWage(search);
	 if(wage != 0)
	 System.out.println("Gross Wage for Employee : "+search+" is :"+wage);
	 else if(wage ==0)
	 System.out.println("Employee ID not found!");
	 }
	}