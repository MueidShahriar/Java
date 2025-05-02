package Package2;
public class Box 
{
    private double height, width, length;
    public void set_values (double h, double w, double l )
    {
        height = h;
        width =w;
        length = l;
    }
    
    public double get_volumn ()
    {
        return height*width*length;
    }
    
    public static void main (String[] args)
    {
       Box b1 = new Box();
       b1.set_values (6.5, 4.5, 2.5);
       double volumn = b1.get_volumn();
       System.out.println(volumn);
    }
}
