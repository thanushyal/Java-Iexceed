//yeild method

class samp extends Thread

{

   public void run()

   {

       this.display();

   }

   public void display()

   {

   for(int i=0;i<+6;i++)

   {

     System.out.println(Thread.currentThread().getName()+"value is "+i);

   }

   }

}

public class pro7 {

   public static void main(String args[])

   {   new samp().run();

       System.out.println("mainmethod");

       Thread.yield();

   }
}
