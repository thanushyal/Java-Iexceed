//string by literal and new keyword

class office

{

   office()

   {

   String offc_name="Iexceed";//string by literal,stores in string constant pool

   String offc_name1="Iexceed";//this itring is already exist so it assign this value to  reference name but does not create new memory

   String place=new String("salem");//creating string by using new keyword,stores in heap memory

   System.out.println("OFFICE NAME:"+offc_name);

   System.out.println("OFFICE NAME:"+offc_name1);




   System.out.println("PLACE:"+place);

   }

}

public class pro1 

{

   public static void main(String args[])

   {

       new office();

   }

   

}
