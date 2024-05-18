//lambda experesion

interface data

{

   public void display();

}


public class pro1 implements data{

public static void main(String args[])

   {

       pro1 p=new pro1();

       p.display();

   }

  public void display()

  {
        System.out.println("lamba exp");

   }

   }



//lambda experesion is anonymous

interface data

{

   public void display();

}

public class pro2
{
public static void main(String args[])
{

    pro1 p=new pro1()     //another method for implementing method in the interface
    {
      public void display() 

    {
       System.out.println("lamba exp");

    }};

    p.display();

   }

   }

