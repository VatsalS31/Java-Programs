package classandobjects;
import java.util.Scanner;
public class accountvalue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the monthly saving amount");
		double monthly_savings=s.nextDouble();
		double acc=0;
		for(int i=0;i<6;i++)
		{
			
			acc=(100+acc)*(1.00417);
			System.out.printf(i+1 + " "+" month saving is  %.2f" , acc);
			System.out.println();
			
			
			
		}
	
		
		

	}

}
