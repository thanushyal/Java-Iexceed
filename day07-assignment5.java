//join() methoddd

class sample extends Thread{

   public void run()

   {

       for(int j=0;j<=8;j++)

       {

           System.out.println(Thread.currentThread().getName()+"is running and value is"+j);

       }

       try

       {

           Thread.sleep(1000);

       }catch(InterruptedException d){}

   }

}

public class pro6 {

   public static void main(String args[])

   {

       Thread t=new Thread(new sample(),"THREAD-1");

       Thread t1=new Thread(new sample(),"THREAD-2");

       t.start();

       try{

           t1.join();

       }catch(InterruptedException d)

       {}

       t1.start();

   }


}
