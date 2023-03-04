package maccess;
import jitendra.*;
public class test {
	public static void main(String[] args) {
		// for each child class we create a object
		two s = new two();
		s.print_one();
		s.print_two();
		
		three t = new three();
		t.print_one();
		t.print_three();
		
		forth f = new forth();
		f.print_one();
		f.print_forth();
	}

}
