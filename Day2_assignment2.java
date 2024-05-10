//using abstract class and abstract method
abstract class route_bus
{
  abstract public void displayplot ();
}
class bustand extends route_bus
{
  public void displayplot ()
  {
	   int plot_no = 15;
	   String plot_name = "tirupur";
     System.out.println ("plot for root_bus in bustand :" + plot_no);
     System.out.println ("plot-name for routebus:" + plot_name);
  }

}


public class Main
{
  public static void main (String[]args)
  {
	  route_bus r = new bustand ();
	  r.displayplot ();

  }
}
