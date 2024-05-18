//lambda experesion

interface data

{

   public void display(int x,int y);

}

public class pro4 {

public static void main(String args[])
{
  data p=(int x,int y)->  //lambda expression  passing parameters

{       
 System.out.println("multiply"+x*y);
};  

p.display(12,20);

}

}
