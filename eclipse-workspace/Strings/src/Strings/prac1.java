package Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class prac1 {
public static int countWords(String str) {
	int w=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			w++;
			
		}
	}
	return w;
	
		
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		int count = prac1.countWords(str);
		System.out.println(count+1);
	}
}