package test;
public class Employeee {
   String eId, eName, eDesg;
//   Address ad;
   Contact c;
   Salary sl;
   public Employeee(Contact c1, Salary c2) {
	   c = c1;
	   sl = c2;
   }
public String toString() {
	   return eId+"\n"+eName+"\n"+eDesg+"\n"+c.mailId+"\n"+
            c.phNo+"\n"+sl.bSal+"\n"+sl.totsal+"\n";
   }
}
