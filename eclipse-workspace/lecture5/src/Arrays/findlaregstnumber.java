package Arrays;
import java.util.Scanner;

public class findlaregstnumber {
	public static int summation(int input[])
	{
		int sum=0;
		for(int i=0;i<input.length;i++)
			
		{
			sum+=input[i];
			
		}
		return sum;
		
	}
	public static int[] inputarray()
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]= s.nextInt();
			
		}
		return input;
			
		
	}
	public static void print(int input[])
			{
		int size = input.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
			
		}
		System.out.println();
		
		
			}
	                   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=inputarray();
		int addition =summation(arr);
		System.out.println(addition);
	}

}
