package maccess;
import java.util.*;
public class DemoStack1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> ob = new Stack<Integer>();
		while(true)
		{
			System.out.println("======choice=========");
			System.out.println("1.push()\n2.pop()\n3.peek()\n4.search()\n5.exit()");
			System.out.println("enter the choice:");
			switch(s.nextInt())
			{
			case 1:
				System.out.println("enter the element:");
				ob.push(new Integer(s.nextInt()));
				System.out.println(ob.toString());
				break;
			case 2:
				if(ob.isEmpty()) {
					System.out.println("Stack is empty...");
				}
				else {
					ob.pop();
					System.out.println(ob.toString());
				}
				break;
			case 3:
				if(ob.isEmpty()) {
					System.out.println("Stack is empty.........");
				}
				else {
					System.out.println(ob.toString());
					System.out.println(ob.peek());
				}
				break;
			case 4:
				if(ob.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("enter the ele to be searched: ");
					Integer n = new Integer(s.nextInt());
					int p = ob.search(n);
					if(p>0) {
						System.out.println("Ele found at position: "+p);
					}
					else {
						System.out.println("Elee not found....");
					}
				}
				break;
			case 5:
				System.out.println("stack operation Stopped...");
				System.exit(0);
			default:
				System.out.println("Invalid choice-------------");
			}
		}
	}
}

/* Output:=
   ======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
5
[5]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
6
[5, 6]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1     
enter the element:
2
[5, 6, 2]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
3
[5, 6, 2, 3]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
7
[5, 6, 2, 3, 7]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
8
[5, 6, 2, 3, 7, 8]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
2
[5, 6, 2, 3, 7]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
2
[5, 6, 2, 3]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
2
[5, 6, 2]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
1
enter the element:
7
[5, 6, 2, 7]
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
3
[5, 6, 2, 7]
7
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
4
enter the ele to be searched: 
6
Ele found at position: 3
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
6
Invalid choice-------------
======choice=========
1.push()
2.pop()
3.peek()
4.search()
5.exit()
enter the choice:
5
stack operation Stopped...

*/
