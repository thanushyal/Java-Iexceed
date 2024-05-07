class car
{
    String c_name;
    int car_no;
    String car_clr;
    car(String c_name,int car_no,String car_clr)
    {
        this.c_name=c_name;
        this.car_no=car_no;
        this.car_clr=car_clr;
        
    }
    public void cardetails()
    {
        System.out.println("name of mycar:"+c_name);
        System.out.println("car_number:"+car_no);
        System.out.println("colour:"+car_clr);
    }
}
class vehicle extends car
{
    String c_name;
    int car_no;
    String car_clr;
    String veh_type;
    vehicle(String c_name,int car_no,String car_clr,String veh_type)
    {
        super(c_name,car_no,car_clr);
        
        this.veh_type=veh_type;
        
    }
    public void veh_tydet()
    {
        super.cardetails();
        System.out.println("type of vehicle:"+veh_type);
    }
}
public class prosuper
{
    public static void main(String args[])
    {
        vehicle d1=new vehicle("Innova",7918,"white","land vehicle");
        d1.veh_tydet();
        
    }
}
