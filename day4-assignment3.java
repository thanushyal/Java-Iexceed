//two dimensional array
//displaying in matrix form
import java.io.DataInputStream;
public class dblearr 
{
   public static void main(String args[])
   {
       DataInputStream d1=new DataInputStream(System.in);
       int mat1[][]=new int[4][3];
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<3;j++)
           {
               try
               { 
                   mat1[i][j]=Integer.valueOf(d1.readLine()).intValue();//getting input to store in array
               }
               catch(Exception d)
               {

               }

           }
       }
       for(int i=0;i<4;i++)
           {
               for(int j=0;j<3;j++)
               {
                   System.out.print(mat1[i][j]);//displaying array elements
               System.out.println(" ");
           }
       
       


   }
   
}





