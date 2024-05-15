//access specifier

//private

class college

{

   private String department="CTUG";//private variable

   private int deptno;//private variable

   college()

   {

       System.out.println("name of the department:"+department);//acess only inside the class constructor

       this.display(201);//access the method inside class only by this.methodname()

   }

   private void display(int deptno)

   {

       System.out.println("department no:"+deptno);

   }

}

public class pri

{

   public static void main(String args[])

   {

       college cobj=new college();

      // cobj.display(201); //not access outside of the class

   }

}
