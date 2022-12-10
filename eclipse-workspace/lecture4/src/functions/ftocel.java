package functions;
import java.util.Scanner;

public class ftocel {
	public static int ftc(int s,int e,int w)
	{
		
		for(int i=s;i<=e;i+=w)
		{
			
			s+=w;
		
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int e= sc.nextInt();
		int w= sc.nextInt();
		 int fah;
		 fah=(5*(s-32)/9);
		 System.out.println(s+" "+fah);
		 
		
		

	}

}
