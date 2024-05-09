//using while loop
public class pro1 {
   public static void main(String args[])
   {
       int rollno=10;
       while(rollno>=0)
       {
           System.out.println("rollno:"+rollno);
           rollno--;

       }
       
   }
   
}


// using do-while loop
public class pro3 {
   public static void main(String args[])
   {
       int n=5;
       int i=0;
   
       do
       {
           System.out.println(i);
           i+=1;
       }while(i<n);
   
   }
   
}


//inner and outer loop for loop
public class pro2 {
   public static void main(String args[])
   {
       for (int s=0;s<5;s++)
       {
           for (int j=0;j<s+1;j++)

           {
               System.out.print(j);
           }
           System.out.println(" ");

       }
       
   }
}
//pattern printing

public class pro4 {
   public static void main(String args[])
   {
       int n=6;
       for(int t=0;t<n;t++)
       {
           for(int j=0;j<=n-t;j++)
           {
               System.out.print(j+1);

           }
           System.out.println(" ");
       }
   }
}


//using break and continue statement
public class probrk {
   public static void main(String args[])
   {
       for(int v=15;v>=5;v--)
       {
           if(v==8)
           {
               break;//break statement

           }
           System.out.println("using break statement"+v);

       }
       for(int s=80;s<=95;s++)
       {
           if(s==90)
           {
               continue;//continue statement

           }
           System.out.println("using continue statement:"+s);

       }
   }
   
}
  
  
   



