//thread (1st way extends thread)

class day6 extends Thread

{

   day6()

   {

       System.out.println("extends thread");

   }

   public void run()

   {

       System.out.println("thread is running ");

   }

}

public class pro10 {

   public static void main(String args[])

   {

       new day6().run();//1st way to call method

       day6 s1=new day6();//2nd way to call method

       s1.start();


   }

}

//threadb(2nd method implements runnable)

import java.lang.Thread;

class day6 implements Runnable

{

   Thread t1=new Thread(this);

   public void run()

   {

       System.out.println(t1.getName());

   }

}

public class pro11 {

   public static void main(String args[])

   {

       day6 d=new day6();

       System.out.println(Thread.currentThread().getName());

       Thread t=new Thread(d);

       t.start();
    

   }

}

//loop in thread

import java.lang.Thread;

class day6 extends Thread

{

   Thread t1=new Thread(this);

   public void run()

   {

       System.out.println(t1.getName());

       for(int i=0;i<+16;i++)

       if(i%4==0)

       {

           System.out.println("child thread"+i);

       }

   }

}

public class pro12 {

   public static void main(String args[])

   {

       day6 d=new day6();

       System.out.println(Thread.currentThread().getName());

       Thread t=new Thread(d);

       

       for(int j=0;j<=20;j++)

       if(j%5==0)

       {

           System.out.println("main thread"+j);

       }

       t.start();

   }

}


