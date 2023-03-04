
                    /*     Interface Methods          */
 package jitendra;
  // interface
 interface Client
 {
	  void webdesign();     //public + abstract
	  void webdeveloper();  // public + abstract
 }
 
 abstract class RajTech implements Client
// If we not define all method in one class and we define remaining method in other class
// then we define first class as a "abstract class"
 {
	 @Override
	public void webdesign()
	 {
		 System.out.println("Green, Top Menu, Search Bar");
	 }
 }
  class RahulTech extends RajTech
//  Here we extends RajTech not implements because we use remaining part from RajTech class
 {
	  @Override
	 public void webdeveloper()
	 {
		 System.out.println("HTML, CSS, Js");
	 }
 }
public class Test1 {
	public static void main(String[] args) {
//		RajTech ob = new RajTech();   // for first method before creating RahulTech
		RahulTech ob = new RahulTech();
		ob.webdesign();
		ob.webdeveloper();
	}
}
