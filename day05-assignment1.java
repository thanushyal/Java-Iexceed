//final
class samp
{
    final int v =5;

}

public class pro2 {
    public static void main(String args[])
    {
        samp s1=new samp();
        System.out.println("number="+s1.v);
    }
}



//final with static
class offc
{
    static final String role_name;
    static final String offc_name;
    
    
    offc()
    {
        final String role_name="null";
        final String offc_name="null";
    
     System.out.println("ROLE NAME:"+role_name);
        System.out.println("OFFICE NAME:"+offc_name);
    }


    static//it will run before constructor
    {
     String role_name="software engineer";
     String offc_name="IExceed";
    }
}
public class pro1 
{
    public static void main(String args[])
    {
        offc o1=new offc();
    
    }
    
}



//fina in array
public class pro3 
{
    public static void main(String args[])
    {
        final int p[]={2,5,6};
        for(int i=0;i<=2;i++)
            {
                System.out.println(p[i]);
                
            }
    }
}
//cannot aassign another array reference to this array because of using final during declaration


//final method
class animal{
    final public void animal_dtls()
    {
        System.out.println("animal"); //it cannot be override by child class.beacuse of final method
    }
}

public class pro4 {
    public static void main(String args[])
    {
        animal a1=new animal();
        a1.animal_dtls();
    }

    
}
