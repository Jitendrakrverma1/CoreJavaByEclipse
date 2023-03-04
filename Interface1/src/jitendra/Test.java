                  
                              /*   Interface Variables    */

package jitendra;
       // interface
 interface customerRaj
 {
	 int amt=5;    // public + static + final
	 void purchase();  // public + abstract
//or :=  public abstract void purchase(); (same)  kuch bhi effect nahi hoga
 }
 
 class SellerSanju implements customerRaj
 {   
	 @Override
	public void purchase()
	 {
//		 amt = 7;(final)  it generate error means "final" value can't change
		System.out.println("Raj needs "+amt+" kf rice.."); 
	 }
 }
public class Test {
	public static void main(String[] args) 
	{
	  customerRaj ob = new SellerSanju();
	  ob.purchase();
	  System.out.println(customerRaj.amt); // means variable is "static" accessed by interface name. 
	  
	}
}
