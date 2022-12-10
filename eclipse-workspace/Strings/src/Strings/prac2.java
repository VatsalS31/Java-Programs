package Strings;

public class prac2 {
	public static String reverse(String str)
	{
		String rev ="";
		for(int i=0;i<str.length();i++)
		{
			rev=rev+str.charAt(str.length()-i-1);
			
			
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		String rev = reverse(str);
		System.out.println(rev);
		if(rev==str)
		{
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT A PALINDROME");
		}
	}

}
