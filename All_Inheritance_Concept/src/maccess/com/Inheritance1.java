package maccess.com;
// that class for bicycle
 class Inheritance1 {
    public int gear;
    public int speed;
    public Inheritance1(int gear, int speed) {
    	this.gear = gear;
    	this.speed = speed;
    }
    public void applyBreake(int decrement) {
    	speed -=decrement;
    }
    public void speedUp(int increment) {
    	speed += increment;
    }
    public String toString() {
    	return speed+" "+ gear;
    }
}
 class MountainBike extends Inheritance1{
	 public int setHeight;
	 public MountainBike(int gear, int speed, int startHeight) {
		 super(gear,speed);
		 setHeight = startHeight;
	 }
	 public void setHeight(int newValue) {
		 setHeight = newValue;
	 }
	 public String toString() {
		 return (super.toString() + "\nsetHeiht is "+ setHeight);
	 }
 }
 
 public class Test1{
	 public static void main(String[] args) {
		 MountainBike t = new MountainBike(3,100,25);
		 System.out.print(t.toString());
	 }
 }
