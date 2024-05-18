//lambda experesion 

interface data

{

   public void display();

}

public class pro3 {

   public static void main(String args[])

   {

       data p=()->         //lambda expression

       {
           System.out.println("lamba exp");

       };            //or data obj->{ System.out.println("lamba exp");};

       p.display();

   }

       

   }
