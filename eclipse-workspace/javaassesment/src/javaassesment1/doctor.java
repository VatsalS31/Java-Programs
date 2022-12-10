package javaassesment1;
//import java.util.Scanner;

//public class doctor {
//	int did;
//    String name;
//    int age;
//    int fee;
//    int nop;
//    void getdetails()
//    {
//        Scanner s = new Scanner(System.in);
//         did=s.nextInt();
//        name=s.next();
//        age=s.nextInt();
//        
//    }
//     void generatebill()
//     {
//         Scanner s = new Scanner(System.in);
//         nop=s.nextInt();
//         fee=nop*300;
//         
//     }
//     void display()
//     {
//         System.out.println(did);
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(nop);
//        System.out.println(fee);
//    }
//     public static void main(String[] arg)
//        {
//            doctor obj=new doctor();
//            obj.getdetails();
//            obj.generatebill();
//            obj.display();
//        }
//
//}
class doctor
{ 
	 public static void A(){
	        System.out.print("Good ");
	        throw new RuntimeException();
	    }
	    public static void B(){
	         A();
	         System.out.print("This ");
	    }
	    public static void main(String[] args){
	        try{
	           B();
	        }
	        catch(Exception e){
	           System.out.print("Time ");
	        }
	        finally{
	           System.out.print("at CodingNinjas");
	        }
	    }
} 

