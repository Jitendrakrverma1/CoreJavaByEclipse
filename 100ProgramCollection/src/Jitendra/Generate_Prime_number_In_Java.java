package Jitendra;
import java.util.Scanner;
public class Generate_Prime_number_In_Java {
	public static void main(String[] args) {
	   int n,i,count;
	   System.out.println("Enter any number:");
	   Scanner s = new Scanner(System.in);
	   n = s.nextInt();
	   System.out.print("Prime number between 1 to "+ n +" are:");
	   for(int j=2; j<=n; j++) {
		   count=0;
		   for(i=1; i<=j; i++) {
			   if(j%i==0) {
				   count++;
			   }
		   }
		   if(count==2)
			   System.out.print(j+" ");
	   }
	  s.close();
	   }
	}

