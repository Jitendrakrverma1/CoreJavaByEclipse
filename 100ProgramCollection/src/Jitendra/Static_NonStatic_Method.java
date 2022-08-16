
                 // Static and Non-Static Method
package Jitendra;
public class Static_NonStatic_Method {
	int a = 20;
	static int b = 10;
	static void show() {
		System.out.println("print static method\n");
		System.out.print(b);
	}
	void disp() {
		System.out.print("Print instance method\n");
		System.out.print(a + " "+ b);
	}
	public static void main(String[] args) {
		Static_NonStatic_Method  s = new Static_NonStatic_Method();
		show();
		s.disp();
	}
}
