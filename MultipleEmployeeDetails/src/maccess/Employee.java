
//WAP to read and display multiple employee details using Array.

package maccess;
public class Employee
{
	public String id , name, desg;
	public int bsal;
	public float totSal;
	public Employee(String id, String name, String desg, int bsal, float totSal)
	{
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.bsal  = bsal;
		this.totSal = totSal;
	}
 public String toString()
 {
	 return id+"\t "+name+"\t"+desg+"\t "+bsal+"\t "+totSal;
  }
}
