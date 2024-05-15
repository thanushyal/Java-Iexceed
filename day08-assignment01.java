//package(pac2)

package packages;

public class p1 { 

   String offc_name;

   String place;

   String role;

   int salary;

  public  p1(String offc_name,String place,String role,int salary)

   {

       this.offc_name=offc_name;

       this.place=place;

       this.role=role;

       this.salary=salary;

       this.display_dtls(offc_name, place);

       this.display_roledtls(role, salary);

   }

   public void display_dtls(String offc_name,String place)

   {

      System.out.println("name of the office:"+offc_name);

      System.out.println("city:"+place);

   }

   public void display_roledtls(String role,int salary)

   {

      System.out.println("role:"+offc_name);

      System.out.println("salary:"+place);

   }

   

}



import packages.*;

class ss2 extends p1

{

   ss2()

   {

       super("iexceed","salem","developer",20000);

   }

   

}

public class pac2 {

   public static void main(String args[])

   {

   ss2 ss=new ss2();

   }


}
