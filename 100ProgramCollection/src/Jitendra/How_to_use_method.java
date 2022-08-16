package Jitendra;
import java.util.Scanner;
public class How_to_use_method {
	int n1, n2, add, sub, mul, div, mod;
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter two number:");
		n1 = s.nextInt();
		n2 = s.nextInt();
		s.close();
	}
	void process() {
		add = n1 + n2;
		sub = n1 - n2;
		mul = n1 * n2;
		div = n1 / n2;
		mod = n1 % n2;
	}
	void output() {
		System.out.println("Sum of two number:"+add);
		System.out.println("Sub of two number:"+sub);
		System.out.println("mul of two number:"+mul);
		System.out.println("div of two number:"+div);
		System.out.println("mod of two number:"+mod);
	}
	public static void main(String[] args) {
		How_to_use_method ob = new How_to_use_method();
		ob.input();
		ob.process();
		ob.output();
	}

}
