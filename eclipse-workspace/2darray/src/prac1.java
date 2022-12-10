import java.util.Scanner;
public class prac1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int row=s.nextInt();
		System.out.println("Enter the columns:");
		int cols= s.nextInt();
		int input[][]=new int[row][cols];
		for(int i=0;i<row;i++)
			for(int j=0;j<cols;j++)
			{
				System.out.println("enter the "+i+" rows "+j+" columns");
				input[i][j]=s.nextInt();
				
			}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(input[i][j]+" ");
			}
				System.out.println();
				
				
				
		}	
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.println(row+cols);
				}
				
			}
			
			
		
	}

}
