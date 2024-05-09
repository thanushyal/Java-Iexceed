//array objects
class bunk
{
    String p_or_d;
    int veh_no;
    int quantity;
    String veh_type;
    public void setp_or_d(String p_or_d)
    {
        this.p_or_d=p_or_d;
    }
    public String getp_or_d()
    {
        return p_or_d;
    }
    public void setveh_no(int veh_no)
    {
        this.veh_no=veh_no;
    }
    public int getveh_no()
    {
        return veh_no;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int getquantity()
    {
        return quantity;
    }
    public void setveh_type(String veh_type)
    {
        this.veh_type=veh_type;
    }
    public String getveh_type()
    {
        return veh_type;
    }
}
public class Main
{
public static void main(String[] args)
{
   bunk b=new bunk ();
   b.setp_or_d("1.petrol");
   b.setveh_no(9698);
   b.setquantity(3);
   b.setveh_type("bike");

    
   bunk b1=new bunk ();
   b1.setp_or_d("2.diesl");
   b1.setveh_no(4523);
   b1.setquantity(20);
   b1.setveh_type("truck");
    
		
   bunk b2=new bunk ();
   b2.setp_or_d("3.petrol");
   b2.setveh_no(5467);
   b2.setquantity(2);
   b2.setveh_type("scooty");
    
   bunk obj_b[]=new bunk[3];
    
   obj_b[0]=b;
   obj_b[1]=b1;
   obj_b[2]=b2;
    
    
   for(int t=0;t<obj_b.length;t++)
    {
        System.out.println(obj_b[t].getp_or_d());
        System.out.println(obj_b[t].getveh_no());
        System.out.println(obj_b[t].getquantity());
        System.out.println(obj_b[t].getveh_type());
     }
		
		
}
}
