package javaassesment1;
import java.util.Scanner;
// BY VATSAL SHAH
// 21BKT0131
// GUIDED BY NIVETHITHA K

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("YEAR WHICH YOU STUDYING:");
		int year=s.nextInt();
		
		switch(year)
		{
			
			case 1:
				System.out.println("ELECTIVE SUBJECT FOR"+" "+year+" "+"st"+" "+ "YEAR"+" "+"FOR ALL BRANCHES"+" "+"IS"+" "+"Engg.Graphics");
				break;
			case 2:
				System.out.println("PRESS 1 FOR CSE:");
				System.out.println("PRESS 2 FOR CCE:");
				System.out.println("PRESS 3 FOR ECE:");
				int branch=s.nextInt();                                      // BRANCH NO.
				switch(branch)                                               // NESTED SWITCH
				{
					case 1:
						System.out.println("ELECTIVE SUBJECT FOR"+" "+year+" "+"nd"+" "+ "YEAR"+" "+"ECE"+" "+"IS"+" "+" "+"JAVA");
						break;
					case 2:
						System.out.println("ELECTIVE SUBJECT FOR"+" "+year+" "+"nd"+" "+ "YEAR"+" "+"ECE"+" "+"IS"+" "+" "+"JAVA");
						break;
					case 3:
						System.out.println("ELECTIVE SUBJECT FOR"+" "+year+" "+"nd"+" "+ "YEAR"+" "+"ECE"+" "+"IS"+" "+" "+"Dig Electronics");
						break;
						
				}	
				
		
		
		}

	}

}
