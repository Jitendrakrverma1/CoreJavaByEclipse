package maccess;
public class StudentData 
{
	public String rollNo, name;
	public StudentData(String rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString()
	{
		return rollNo+"\t"+name;
	}
}
