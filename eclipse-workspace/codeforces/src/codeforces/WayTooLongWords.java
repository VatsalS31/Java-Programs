package codeforces;
import java.util.Scanner;

public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String[] str=new String[100];
		
		int n=s.nextInt();
		
			for(int i=0;i<=n;i++)
			{
			 str[i]=s.nextLine();
			 
			}
		for(int i=0;i<=n;i++)
			{
			if (str[i].length()<=10)
			{
				System.out.println(str[i]);
			}
			else
			{
				
				System.out.print(str[i].charAt(0));
				System.out.print(str[i].length()-2);
				System.out.print(str[i].charAt(str[i].length()-1));
				System.out.println();
			}
				
			}
			
		}
		
		
		
	
		
		
		
		
		
		
	}
	
	
	
