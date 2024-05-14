//thread sleep

class samp extends Thread

{

   public void run()

   {

       for(int i=0;i<=8;i++)

       {

        

       try

       {

           System.out.println("child thread"+i);

           Thread.sleep(2000);

       }

       catch(InterruptedException s)

       {

           System.out.println(" "+s.getMessage());

       }

   }

   }

}

public class pro2 {

   public static void main(String args[])

   {

       samp s1=new samp();

       s1.start();

       for(int i=0;i<=8;i++)

       {

       try

       {

           System.out.println("main thread"+i);

           Thread.sleep(1000);

       }

       catch(InterruptedException s){}

       }

   }
