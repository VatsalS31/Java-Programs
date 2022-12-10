package classandobjects;
import java.util.Scanner;

public class student {
	String name;
	int rollno;
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		student s1=new student();
		s1.name="Vatsal";
		s1.rollno=123;
		System.out.println(s1.name+" "+s1.rollno);
	}

}
