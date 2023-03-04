package jitendra;
public class MoutainBike extends Bicycle 
 {
    public int setHeight;
    public MoutainBike(int gear, int speed, int startHeight) 
    { 
    	super(gear,speed);   // invoking Parent_class_constructor
    	setHeight = startHeight;
    }
    // method for setting value of setHeight
    public void setHeight(int newvalue) 
    {
    	setHeight = newvalue;
    }
    // here override the toString() method of PClass by using super keywords
    public String ToString() {
    	return (super.toString() + "\nset Height is" + setHeight);
    }
 }
