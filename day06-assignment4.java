//StringJoiner

import java.util.StringJoiner;

public class pro6 {

   public static void main(String args[])

   {

       String s[]={"hello","welcome","to","iexceed"};//concat in array

       String s3=String.join(" ",s);

       System.out.println("concat in array:"+s3);

       StringJoiner joiner=new StringJoiner("");//concationation through stringjoiner

       joiner.add("hello ");

       joiner.add(" thanu");

       System.out.println("concat through stringjoiner:"+joiner);

   }

}
