package classandobjects;
import java.util.Scanner;
public class energycalculation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter amount of water in kj");
		double water_amount=s.nextDouble();
		System.out.println("enter inital temperature");
		double intial_temp=s.nextDouble();
		System.out.println("enter final temperature");
		double final_temp=s.nextDouble();
		
		double energy=(water_amount)*(final_temp-intial_temp)*4184;
		System.out.println("enrgy= " +energy+ " joules");
	}

}
