package kickstartgoogle;
import java.util.Scanner;
public class roundepalindrome {

	static int find(int a){
        int j = 0;
        for(int i =0; i<a;i+=4){
            if(i%2 == 0){
                j++;
            }
        }
        return j;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        sc.nextLine();
        for(int i = 0;i<t;i++){
            int r = sc.nextInt();
            arr[i] = find(r);
        }
    for(int i = 0;i<t;i++){
        System.out.println("Case #"+(i+1)+": " + arr[i]);
    }
}
         
        	

	}


