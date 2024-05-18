//example for anonymous function

public class mymethod extends Thread{
    public static void main(String[] args) {
        new Thread(){                     //Anonmous Function
            public void run()
            {
                for(int j=0;j<=10;j++)
                  {
                    if(j%2==0)
                    {
                
                    System.out.println(i);
                    }
                }
            }
        }.start();
    }
}
