//single dimensional array
import java.io.DataInputStream;

public class si_array {
   public static void main(String args[])

   {
       String array1[]=new String[3];//array declaration 
       int array2[]=new int[3];
       DataInputStream a1=new DataInputStream(System.in);

       DataInputStream a2=new DataInputStream(System.in);
       for(int i=1;i<=array1.length;i++)
       {
           try
           {
               System.out.println("student name"+i);
               array1[i]=a1.readLine();    

           }catch(Exception d){}
       }
       for(int j=1;j<=array2.length;j++)
       {
           try
           {
               System.out.println("student rollno"+j);
               array2[j]=Integer.parseInt(a2.readLine());    

           }catch(Exception e){}
       }


   }
}


//single dimensional array,get input using datainputstream
import java.io.DataInputStream;

  

public class pro5 {
   public static void main(String args[])
   {
       String name;
       int rollno;
       try
       {
           DataInputStream s1=new DataInputStream(System.in);
           name=s1.readLine();
           rollno=Integer.parseInt(s1.readLine());
           System.out.println("Name of the student:"+name);
           System.out.println("Roll of the student:"+rollno);
       }catch(Exception d){}
   }
   
}
