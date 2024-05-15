//Add class in exixting package(pak3)

package packages;

public class pp2 {

   String vehicle;

   public pp2(String vehicle)

   {

       this.vehicle=vehicle;

       switch ((vehicle)) 

       {

           case "car":

           System.out.println(" car match found");

           break;




           case "bus":

           System.out.println(" bus match found");

           break;




           case "bike":

           System.out.println("bike match found");

           break;


           case "truck":

           System.out.println("truck match found");

           break;

       

          

       }




   }

}

import packages.*;

class ss2 extends pp2

{

   ss2()

   {

       super("bus");

        

   }

   

}


public class pak3 {

   public static void main(String args[])

   {

   ss2 ss=new ss2();

   }

}
