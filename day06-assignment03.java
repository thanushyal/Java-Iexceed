//mutable string concatination

public class pro4 {

   public static void main(String args[])

   {

       StringBuffer b1=new StringBuffer("Python");//it has own method(append),because it is mutable

       StringBuffer b2=new StringBuffer("Programming");

       System.out.println("concatination in mutability:"+b1.append(b2));

       StringBuilder c1=new StringBuilder ("hello");

       StringBuilder c2=new StringBuilder(" welcome to learning python");

       System.out.println("concatination in mutability:"+c1.append(c2));//it has own method(append),because it is mutable

   }

}


//immutable concatination method

public class pro5 {

   public static void main(String args[])

   {

       String s1="Kongu";

       String s2=" engineering college";

       System.out.println("concatination in immutable:"+s1+s2);

       System.out.println("by concat method:"+s1.concat(s2));

       String b1=new String ("Welcome ");

       String b2=new String(" to Iexceed");

       System.out.println("concatination in immutable:"+b1+b2);

       System.out.println(" by concat method"+b1.concat(b2));

   }

}
