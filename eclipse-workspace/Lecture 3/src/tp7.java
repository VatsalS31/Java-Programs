import java.util.Scanner;
public class tp7 {

	public static void main(String[] args) {
		
		
				Scanner s =new Scanner(System.in);
				int n = s.nextInt();
				int i=1;
				while(i<=n)
				{
					int j =1;
					
					while(j<=n-i)
					{
						System.out.print(" ");
						j++;
					
					}
					j=i;
					
					while(j<=i)
					{
						System.out.print(j);
						 
						j++;
						
					}
					j=2*i-2;
					while(j>i-1)
					{
						 System.out.print(j-1);
						 j--;
						
					}
					 System.out.println();
					 i++;
					
			}

		}
		


	}


