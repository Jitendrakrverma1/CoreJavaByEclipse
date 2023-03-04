package test;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

import maccess.*;
public class DemoArray4
{
   public static void main(String[] args)
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the number of Empl: ");
	   int n = Integer.parseInt(s.nextLine());
	   Employee []arr = new Employee[n]; // Employee Array Object
	   System.out.println("Enter "+n+" employee details: ");
	   for(int i=0; i<arr.length; i++)
	   {
		   System.out.println("enter the emp id: ");
		   String id = s.nextLine();
		   System.out.println("Enter the emp name: ");
		   String name = s.nextLine();
		   System.out.println("enter the emp desg: ");
		   String desg = s.nextLine();
		   System.out.println("Enter the emp bsal: ");
		   int bsal = Integer.parseInt(s.nextLine()); 
		   float totSal = bsal + (0.93F*bsal)+(0.63F*bsal);
		   arr[i] = new Employee(id,name,desg,bsal, totSal);
	   }
	   System.out.println("Employee details: ");
	   Spliterator<Employee> sp = Arrays.spliterator(arr);
	   sp.forEachRemaining(k->
		 {
		   System.out.println(k.toString());
	   });
	   s.close();
   }
}

/* Ouput :=
   Enter the number of Empl: 
5
Enter 5 employee details: 
enter the emp id: 
A11
Enter the emp name: 
Jitendra
enter the emp desg: 
Software developer
Enter the emp bsal: 
35000
enter the emp id: 
A12
Enter the emp name: 
Pankaj
enter the emp desg: 
Web developer
Enter the emp bsal: 
25000
enter the emp id: 
A13
Enter the emp name: 
Mangal
enter the emp desg: 
Content Writer
Enter the emp bsal: 
11000
enter the emp id: 
A14
Enter the emp name: 
Aman
enter the emp desg: 
Block chain developer
Enter the emp bsal: 
45000
enter the emp id: 
A15
Enter the emp name: 
Anil
enter the emp desg: 
Data Science
Enter the emp bsal: 
45000
Employee details: 
   A11	 Jitendra	Software developer	 35000	 89600.0
   A12	 Pankaj	    Web developer	     25000	 64000.0
   A13	 Mangal	    Content Writer	     11000	 28160.0
   A14	 Aman	    BlockChain developer 45000	 115200.0
   A15	 Anil	    Data Science	     45000	 115200.0

*/
