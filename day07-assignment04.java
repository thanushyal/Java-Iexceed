//multiple thread  sleep,multiple methods

class samp extends Thread

{
   public void run()

   {
       for(int i=0;i<=8;i++)

       {
           System.out.println(Thread.currentThread().getName()+"is running and value is"+i);
       try
       {
           Thread.sleep(1000);

       }

       catch(InterruptedException s)

       { }

   }

   }

}

class samp1 extends Thread

{
   public void run()

   {
       for(int i=2;i<=15;i++)

       {

           System.out.println(Thread.currentThread().getName()+"is running and value is"+i);

       try

       {
           Thread.sleep(2000);

       }

       catch(InterruptedException s)

       { }

   }

   }

}

public class pro4 {

   public static void main(String args[])

   {
       samp s1=new samp();

       samp1 s2=new samp1();

       s1.setName("thread1");

       s2.setName("thread2");

       s1.start();

       s2.start();

   }

}
