package maccess;
import java.util.*;
public class Demoqueue1 {
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   Queue<Integer> ob = new PriorityQueue<Integer>();
	   while(true)
	   {
		   System.out.println("=====choice=====");
		   System.out.println("1.add\n2.remove\n3.element\n4.peek\n5.poll\n6.exit.");
		   System.out.println("Enter the choice: ");
		   switch(s.nextInt())
		   {
		   case 1:
			   System.out.println("Enter the element:");
			   ob.add(new Integer(s.nextInt()));
			   System.out.println(ob.toString());
			   break;
		   case 2:
			   if(ob.isEmpty()) {
				   System.out.println("Queue is empty..");
			   }
			   else {
				   ob.remove();
				   System.out.println(ob.toString());
			   }
			   break;
		   case 3:
			   if(ob.isEmpty()) {
				   System.out.println("Queue is empty........");
			   }
			   else {
				   System.out.println("element "+ob.element());
				   System.out.println(ob.toString());
			   }
			   break;
		   case 4:
			   if(ob.isEmpty()) {
				   System.out.println("Queue is empty........");
			   }
			   else {
				   System.out.println("peek "+ob.peek());
				   System.out.println(ob.toString());
			   }
			   break;
		   case 5:
			   if(ob.isEmpty()) {
				   System.out.println("Queue is empty........");
			   }
			   else {
				   System.out.println("poll "+ob.poll());
				   System.out.println(ob.toString());
			   }
			   break;
		   case 6:
			   System.out.println("Queue operation ended.........");
			   System.exit(0);
		   default:
			   System.out.println("Invalid choice");
		   }
	   }
	}
}

/* output:=
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
1
[1]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
2
[1, 2]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
3
[1, 2, 3]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
4
[1, 2, 3, 4]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
5
[1, 2, 3, 4, 5]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
2
[2, 4, 3, 5]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
2
[3, 4, 5]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
9
[3, 4, 5, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
2
[4, 9, 5]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
2
[5, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
8
[5, 9, 8]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
1
[1, 5, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
3
element 1
[1, 5, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
3
element 1
[1, 5, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
3
element 1
[1, 5, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
4
peek 1
[1, 5, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
1
Enter the element:
7
[1, 5, 8, 9, 7]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
4
peek 1
[1, 5, 8, 9, 7]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
poll 1
[5, 7, 8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
poll 5
[7, 9, 8]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
poll 7
[8, 9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
poll 8
[9]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
poll 9
[]
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
5
Queue is empty........
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
2
Queue is empty..
=====choice=====
1.add
2.remove
3.element
4.peek
5.poll
6.exit.
Enter the choice: 
6
Queue operation ended.........

*/
