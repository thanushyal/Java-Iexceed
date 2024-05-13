//string methods

import java.util.Objects;

class meth

{

   meth()

   {

       String name="Kongu Engineering College";

       System.out.println("length of string is :"+name.length());//length

       System.out.println("character at given position is :"+name.charAt(9));//charAt

       String str1="hy!";

       String str2="welcome to Iexceed";

       System.out.println("String Concatination:"+str1.concat(str2));//concatination

       if(str2.contains("Iexceed"))

       {

           System.out.println("conatins method statement is about given string");

       }

       else

       {

           System.out.println("conatins method statement is not about given string");//contains

       }

       String s1="thanushya";

       System.out.println("convert to uppercase:"+s1.toUpperCase());//toupper

       String s2="LOGANATHAN";

       System.out.println("convert to uppercase:"+s2.toLowerCase());//tolower

       System.out.println("concatination FULL NAME :"+s1.concat(s2));//concatination

       System.out.println("using equals:"+s1.equals(s2));//equals method

       String m1="Iexceed";

       String m2="iExceed";

       System.out.println("using equalsignorecase:"+m1.equalsIgnoreCase(m2));//equalsignorecase

       System.out.println("using equals(diff case):"+m1.equals(m2));//equals method

       if(str2.equalsIgnoreCase("welcome to iexceed"))//equalsignorecase

       {

           System.out.println("name present");

       }

       else

       {
          System.out.println("name not present");

       }

       if(name.contains("college"))//contains in if condition

       {

           System.out.println("given string is found");

       }

       else

       {

           System.out.println("given string is not found");

       }

       String st1="sriHariesh";

       String st2=new String("sriHariesh");

       if(s1==s2)//stores in heap memory,compare reference not value

       {

           System.out.println("st1 euqal st2");

       }

       else

       {

           System.out.println("st1 not euqal st2");

       }

       if(Objects.equals(s1,s2))//it is object method stores in heap memory nd String constant pool,compare only the value

       {

           System.out.println("s1 euqal s2");

       }

       else

       {

           System.out.println("s1 not euqal s2 ");
       }

       String p1=new String ("MITHUN");

       String p2=new String("MITHUN");

       if(Objects.equals(p1,p2))//it is object method stores in heap memory nd String constant pool,compare only the value

       {
           System.out.println("p1 euqal p2");

       }
       else

       {
           System.out.println("p1 not euqal p2");
       }

       String x1="jhohith";

       String x2="jhohith";

       if(x1==x2) //stores in string constant pool

       {

          System.out.println("x1 euqal to x2");

       }

        else

        {

          System.out.println("x1 not euqal to x2");
       }

       String x11="jhohith";

       String x22="jhohith";

      if(Objects.equals(x11,x22)) //stores in string constant pool

      {

         System.out.println("x11 euqal to x22");
     }

     else

     {

       System.out.println("x11 not euqal to x2");
 
     }

     int b1=100;

     String c1="  is total marks";

    System.out.println("concatination by plus:"+b1+c1);//concatination by plus

    String v1="hello";

    String v2=" thanu";

    String v3=" welcome";

    System.out.println("concatination chain:"+v1.concat(v2).concat(v3));//concatinationchain

   }
}

public class pro2 
{

   public static void main(String args[])

   {
     new meth();
   }
}




