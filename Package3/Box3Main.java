package Package3;
import Package2.Box;

public class Box3Main 
{
     public static void main (String[] args)
    {
       Box b1 = new Box();
       b1.set_values (6.5, 4.50, 2.5);
       double volumn = b1.get_volumn();
       System.out.println(volumn);
    }
}
