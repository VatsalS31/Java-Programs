package functions;
import java.util.Scanner;
public class ncr {
	public static int fact(int n)
	{
		int ans =1;
		for(int i=1;i<=n;i++)
		{
			ans*=i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	int r = s.nextInt();
	int num=1;
	num=fact(n);
	int den1=1;
	den1=fact(r);
	int den2=1;
	den2=fact(n-r);
	 
	int ans = num/(den1*den2);
	System.out.println(ans);
	
		
	}

}
