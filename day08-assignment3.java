//accessing private method

import java.lang.reflect.Method;

class college

{
   private int deptno=909;//private variable

   private void display()

   {

       System.out.println("department no:"+deptno);

   }

}

public class pricon {

   public static  void main(String args[])throws Exception

   {

       Class s=Class.forName("college");

       Object o=s.newInstance();

       Method m=s.getDeclaredMethod("display",null);

       m.setAccessible(true);

       m.invoke(o,null);

   }

}
