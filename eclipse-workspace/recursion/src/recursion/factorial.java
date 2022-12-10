
package recursion;
import java.util.*;


public class factorial {
	public static int fact(int n)
	{
	if(n==1)
	{
			return 1;
		}
		
		int smallans=fact(n-1);
		return n+smallans;
	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. to calculate sum of n natural no.s");
		int n=s.nextInt();
		int ans=fact(n);
		System.out.println(ans);
		
		
	}

}
