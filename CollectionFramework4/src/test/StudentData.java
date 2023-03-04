
// WAp to read and display user defined class objects using Set<E>.

package test;
public class StudentData extends Object implements Comparable
{
   public String name,rollNo;
   public StudentData(String name, String rollNo)
   {
	   this.name = name;
	   this.rollNo = rollNo;
   }
   
  public String toString()
  {
	  return name+" "+rollNo;
  }
@Override
public int compareTo(Object o) {
	 StudentData sd = (StudentData)o;
	  if(rollNo==sd.rollNo) return 0;
	  else if(name==sd.name) return 1;
	  else return -1;
   }
}
