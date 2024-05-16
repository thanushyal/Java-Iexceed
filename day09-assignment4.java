//search methods

import java.util.Iterator;

import java.util.LinkedList;

public class pro4{

public static void main(String args[])

{

   LinkedList <String> a1=new LinkedList<String>();//Creating arrays

   //Adding object in arraya1  

   a1.add("s");

   a1.add("w") ;

   a1.add("ue"); 

   a1.add("vy");

   a1.add("ot");

   a1.add("rep");

   a1.add("prr");

   a1.add("hello");

   a1.add("t") ;

   a1.add("u"); 

   a1.add("v");

   a1.add("o");

   a1.add("p");

   a1.add("p");

   int index= a1.indexOf("hello");//search from head

   if(index!=-1)

   {

       System.out.println("element is available");

   }

   else{

       System.out.println("element is not available");


   }

   int index1= a1.lastIndexOf("hello");//search from tail

   System.out.println(index1);

   Boolean b=a1.contains("rep");//contains

   System.out.println(b);

   if(b==true)

   {

       System.out.println("element is available");

   }

   else

   {

       System.out.println("element is not available");

}

}

}
