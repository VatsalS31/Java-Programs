package classandobjects;
//import java.util.Scanner;

public class miletokilo {

	public static void main(String[] args) {
	//	Scanner s = new Scanner(System.in);
		double kilo=0;
		int miles=1;
		System.out.println("miles"+"   "+" kilometers");
		System.out.println();
		for(int i=0;i<10;i++)
		{
			kilo=1.609*miles;
			miles++;
			System.out.println(i+1+"         "+ kilo);
		}
		
		
	}

}
