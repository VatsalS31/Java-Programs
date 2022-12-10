package javaassesment1;
import java.util.Scanner;

//BY VATSAL SHAH
//21BKT0131
//GUIDED BY : NIVETHITHA K MAM

public class q1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char choice='Y';
		while(choice=='Y')
		{
			System.out.println("INPUT THE EMPLOYEE ID:");
			int emp_id=s.nextInt();
			System.out.println("INPUT THE TAXABLE INCOME:");
			int taxable_income=s.nextInt();
			if(taxable_income<=200000)
			{
				double income_tax=taxable_income;                      // 0% income tax 
				System.out.println("Income Tax:"+income_tax);
			}
			if(taxable_income>200000 && taxable_income<=500000 )
			{
				double income_tax=(taxable_income)*0.1;               // 10% income tax
				System.out.println("Income Tax:"+income_tax);
			}
			if(taxable_income>500000 && taxable_income<=1000000 )
			{
				double income_tax=(taxable_income)*0.2;               // 20% income tax
				System.out.println("Income Tax:"+income_tax);
			}
			if(taxable_income>1000000)
			{
				double income_tax=(taxable_income)*0.3;               // 30% income tax 
				System.out.println("Income Tax:"+income_tax);
			}
			System.out.println(" ");
			System.out.println("DO YOU WANT TO CONTINUE(Y/N):");
			choice=s.next().charAt(0);
		}
	}
}		
		
		
	


