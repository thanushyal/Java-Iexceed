//upcast
class samp
{
    public void bsc()
    {
        System.out.println("BSC CTUG");
    }
    public void  bsc_SS()
    {
        System.out.println("SS CTUG");
    }
}
class samp1 extends samp{
    public void  bsc()
    {
        System.out.println("CSD branch in CTUG");
    }
    public void  bsc_SS()
    {
        System.out.println("SS branch in CTUG");
    }
}
public class mupcast
{
public static void main(String[] args) {
samp1 s1=new samp1();
samp s=new samp1();
s.bsc();
s.bsc_SS();
}
}

//downcast

class samp
{
    public void bsc()
    {
        System.out.println("BSC CTUG");
    }
    public void  bsc_SS()
    {
        System.out.println("SS CTUG");
    }
    public void bsc_IS()
    {
        System.out.println("IS BRANCH");
    }
}
class samp1 extends samp{
    public void  bsc()
    {
        System.out.println("CSD branch in CTUG");
    }
    public void  bsc_SS()
    {
        System.out.println("SS branch in CTUG");
    }
}
public class mdwncst
{
public static void main(String[] args) {
samp s1=new samp1();//downcast
samp1 s=(samp1)s1;
s.bsc();
s.bsc_SS();
s.bsc_IS();
}
}
