//abstraction
abstract class student
{
    abstract public void stud_dtl();
    public void stud_addrs()
    {
        String place="uthukuli";
        String dt="tirupur";
        System.out.println("place of the students:"+place);
        System.out.println("district:"+dt);
    }
}


class st_dtls extends student
{
    public void stud_dtl()
    {
        String name="Mithun";
        int rollno=20;
        System.out.println("Name of the students:"+name);
        System.out.println("Roll number:"+rollno);
    }
}
public class proabstraction {
    public static void main(String args[])
    {
    st_dtls d=new st_dtls();
    d.stud_dtl();
    d.stud_addrs();
    }

    
}
