package practise;
import java.util.Scanner;

public class pairsum1 {
	//package Arrays;
	
	//public class pairsum {

		public static int main(String[] args) {
			Scanner s =new 	Scanner(System.in);
			int size = s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=s.nextInt();
			}
			int x=s.nextInt();
			
			int count=0;
	        for(int i=0;i<size;i++)
	        {
	            for(int j=i;j<size;j++)
	            {
	                if(arr[i]+arr[j]==x)
	                {
	                    count+=1;    
	                }
	            }
	        }
	        System.out.println(count);
	        return 0;

		}

	}



