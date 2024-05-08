//aggregation

class aggg{
   String stu_name;
   String clg_name;
   department dpt;
   public void stud(String stu_name,String clg_name,department dpt)
   {
       this.stu_name=stu_name;
       this.clg_name=clg_name;
       this.dpt=dpt;
   }
}

public class agg {
   public static void main(String args[])
   {
       department d1= new department("CSE",201);
       aggg a1=new aggg();
       a1.stud("sri","kec",d1);
       System.out.println("name:"+a1.stu_name);
       System.out.println("college name:"+a1.clg_name);
       System.out.println("Department name:"+a1.dpt.dep_name);
       System.out.println("class number:"+a1.dpt.class_no);
   }
}





       


class department
{
   String dep_name;
   int class_no;
   department(String dep_name,int class_no)
   {
       this.dep_name=dep_name;
       this.class_no=class_no;
       
   }
}
