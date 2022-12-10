package javaassesment1;
import java.util.Scanner;
// BY VATSAL SHAH
// 21BKT0131
// GUIDED BY NIVETHITHA K MAM
public class q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int pos=0;
		int neg=0;
		double tot=0;
		int count =0;
		System.out.println("Enter the Integers:");
		
		double n=s.nextDouble();
		
		while(n!=0)                   //CONDITION WHEN IT WILL TERMINATE
		{
			
			if(n>0)
			{
				pos++;
				
			}
			else if(n<0)
			{
				neg++;
			}
			tot+=n;
			count++;
			n=s.nextDouble();
		}
		double avg = tot/count;
		
		System.out.println("The number of positives is :"+pos);
		System.out.println("The number of negatives is: "+neg);
		System.out.println("The total is : "+tot);
		System.out.println("The average is: "+avg);
		
	}

}
