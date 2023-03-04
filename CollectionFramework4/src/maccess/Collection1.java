package maccess;
public class Collection1
{
	public String rollNo,name;
	public Collection1(String rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public String toString()
	{
		return rollNo+"\t"+name;
	}
}