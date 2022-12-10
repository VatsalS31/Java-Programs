package javaassesment1;
//	BY VATSAL SHAH
// 21BKT0131
// GUIDED BY NIVETHITHA K MAM

import java.io.*;
public class Q3
{
	
	public static void main (String args[])throws IOException
{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);                    // BUFFEREADER CLASS
		int n, reverse=0;
		System.out.println("Enter a number to reverse");
		n=Integer.parseInt(in.readLine());
		while(n != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
			System.out.println("Reverse of the number is " + reverse);
	}
}
