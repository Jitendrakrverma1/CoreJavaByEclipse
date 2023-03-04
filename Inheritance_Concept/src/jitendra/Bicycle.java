    // Inheritance:= It is a mechanism in java by which one class is allowed to inherit the features of
     // another class.
   
    // How to use Inheritance in java:= using extends keywords.
    // Syntax;= 
    /*
        class derived_class extends base_class 
          {
               
             // method and fields.
          }
     */
package jitendra;
public class Bicycle
 {
   public  int gear;
   public int speed;
   // create constructor of Bicycle class
   public Bicycle(int gear, int speed) {
	   this.gear = gear;
	   this.speed = speed;
   }
   // creating three methods for Bicycle class
   // method for brake
   public void applyBrake(int decrement) {
	   speed -= decrement;
   }
   // method for speedup
   public void speedUp(int increment) {
	   speed += increment;
   }
   // method for printing the output
   public String toString() {
	   return "No. of gear's:"+gear+" "+"speed of bicycle is:"+speed;
   }
 }
