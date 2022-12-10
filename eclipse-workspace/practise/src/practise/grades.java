package practise;
import java.util.Scanner;
public class grades {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char Grade[][]= new char[5][7];
		System.out.println("Input the answers given by student:");
		for(int i=0;i<5;i++)
		{
			System.out.print("Student"+(i+1)+" : ");
			for(int j=0;j<7;j++)
			{
			 Grade[i][j]=s.next().charAt(0);
			}
		}
		System.out.println("Enter the Answer key");
		char key[]= new char[7];
		
		for(int i=0;i<7;i++)
		{
			key[i]=s.next().charAt(0);
		}
		 int k=0;
		 int count=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(Grade[i][j]==key[k])
				{
					count++;
					
				}
				k++;
				
				
			
			}
			System.out.println("Student "+(i+1)+" has"+count+" correct answers");
		}
		
			
		
		
	}

}
