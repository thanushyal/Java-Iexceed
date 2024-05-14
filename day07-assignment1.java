//Runnable

import java.lang.Thread;

class clg implements Runnable

{

   public  void run ()

   {

       System.out.println("child thread in class colg");


   }

}


public class pro1 {

   public static void main(String args[])

   {

       clg c=new clg();

       Thread t=new Thread(c);//explicitly create thread

       t.start();

       System.out.println("child thread in main class");

       t.setName("THREAD 1");

       System.out.println(t.getName());

   }

}
