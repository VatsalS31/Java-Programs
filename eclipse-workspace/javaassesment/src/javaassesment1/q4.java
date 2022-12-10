package javaassesment1;
import java.util.Scanner;
// BY VATSAL SHAH
// 21BKT0131
// GUIDED BY NIVETHITHA K MAM

public class q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PRESS 1 FOR LOOP 1");
		System.out.println("PRESS 2 FOR LOOP 2");
		System.out.println("PRESS 3 FOR LOOP 3");
		int n =s.nextInt();
		switch(n)
		{
			case 1:
				int i = 1; 
				int count =0;                 // COUNT VARIABLE FOR COUNTING HOW MANY TIMES LOOP WILL RUN
				while (i < 10)                //LOOP 1 
				{
					if (i % 2 == 0) 
					{
						System.out.println(i);
					}
					count++;
				}
				System.out.println("  ");
				System.out.println("THE LOOP WILL RUN"+" "+count+ " "+"TIMES");
				break;
			case 2:
				int j = 1; 
				count =0;
				while (j < 10)               //LOOP 2
				{
					if (j % 2 == 0) 
					{
						
						System.out.println(j++);
						
					}
					count++;
				}
				
					System.out.println("  ");
					System.out.println("THE LOOP WILL RUN"+" "+count+ " "+"TIMES");
					break;
			case 3:
				int k = 1; 
				count=0;
				while (k < 10)              //LOOP 3
				{
					
					if ((k++) % 2 == 0) 
					{
						System.out.println(k);
					}
					count++;
				}
				System.out.println("  ");
				System.out.println("THE LOOP WILL RUN"+" "+count+ " "+"TIMES");
				break;
			
		}

	}

}
