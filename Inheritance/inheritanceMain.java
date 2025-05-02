package Inheritance;

public class inheritanceMain 
{
    public static void main (String[] args)
    {
        inheritance3 obj1 = new inheritance3();
        obj1.set_radius(5.5);
        System.out.println("Area of Circle: "+obj1.get_area());
        System.out.println("Circumference of Circle: "+obj1.get_circumference());
    }
}
