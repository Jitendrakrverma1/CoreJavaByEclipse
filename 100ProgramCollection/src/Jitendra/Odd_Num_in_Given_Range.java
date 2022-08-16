package Jitendra;
import java.util.Scanner;
public class Odd_Num_in_Given_Range 
 {
	public static void main(String[] args) {
       int n;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the numbr:");
       n = s.nextInt();
       
       //Using only for loop
       for(int i=1; i<=n; i+=2) 
       {
    	   System.out.print("Odd number"+ i +" " );
       } 
       
       // using for loop with if statement
       for(int i=1; i<=n; i++) {
    	   if(i%2!=0) {
    		   System.out.print(i+" ");
    	   }
       }
       s.close();
       }
}
//output:=
//    Enter the number:10
//    1 3 5 7 9 
