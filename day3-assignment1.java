//static and non static block
class samp
{
   static String fname;
   static String lname;
   //non static method
   {
       System.out.println("MailId:"+fname+lname+"@i-exceed.com");
   }
   //static method
   static
   {
       fname="Thanushya";
       lname="Loganathan";
       System.out.println("FIRST NAME:"+fname);
       System.out.println("LASTNAME:"+lname);
   }
   

}
public class sta_nonsta 
{
   public static void main(String args[])
   {
       
       samp s = new samp();
       System.out.println("Iexceed-salem");

   }
   
}
