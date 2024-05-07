class details
{
  details (int r_no, String name, int age, int t_mark)
  {
	System.out.println ("RollNO:" + r_no);
	System.out.println ("Name:" + name);
	System.out.println ("Age:" + age);
	System.out.println ("Total Mark:" + t_mark);
  }
  public static void chkel (int age)
  {
      System.out.println("eligible for throwball");
	if (age >= 12)
	  {
	 System.out.println ("eligible for jonal match");
	  }
	else
	  {
	    System.out.println ("not eligible for jonal match");
	  }
  }
  public void t_grade (int t_mark)
  {
	if (t_mark < 80)
	  {
		System.out.println ("Grade-E");
	  }
	else if ((t_mark >= 80) && (t_mark < 250))
	  {
		System.out.println ("Grade-D");
	  }
	 else if((t_mark>=250)&&(t_mark<350))
	 {
	     System.out.println("Grade-C");
	 }
	 else if((t_mark>=350)&&(t_mark<450))
	 {
	     System.out.println("Grade-B");
	 }
	 else if((t_mark>=450)&&(t_mark<=600))
	 {
	     System.out.println("Grade-A");
	 }
	else
	  {
		System.out.println ("Chk marks");
	  }
  }
  public boolean mstatus(String status)
  {
      if(status!="yes")
      {
        return false;
      }
    return true;
  }
}
public class student
{
  public static void main (String args[])
  {
	details st = new details (206, "sri", 21, 550);
	  st.chkel (21);
	  st.t_grade(550);
	  System.out.println(st.mstatus("no"));
  }  
}
