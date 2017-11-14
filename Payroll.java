import java.util.Scanner;

public class Payroll {

	private static Scanner keyboard;

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub 

	        double hoursPayrate, overtimeHours;
	        int hoursWorked;


	        keyboard = new Scanner(System.in);

	        System.out.println("Enter the hours worked");
	        hoursWorked = keyboard.nextInt();

	        System.out.print("Enter the payrate ");
	        hoursPayrate = keyboard.nextInt();

	        System.out.print("Enter the overtime hours");
	        overtimeHours = keyboard.nextInt();

	    if (hoursWorked < 40)
	    {
	    System.out.printf("The calculated pay is $%, .2f\n", 
	    Payrolls.calculatePayroll(hoursPayrate,hoursWorked));
	    }
	    else
	    {
	    	Payrolls.calculatePayroll(hoursPayrate, hoursWorked);
	    System.out.printf("The calculated pay is $%, .2f\n", 
	    	    Payrolls.calculatePayroll(hoursPayrate,hoursWorked));
	    }
}
}