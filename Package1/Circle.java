import java.util.Scanner;
public class Circle 
{
    public float area(int r)
    {
        return (float)3.1416*r*r;
    }
    public float circumfereance(int r)
    {
        return 2*(float)3.1416*r;
    }
    
    public static void main(String[] args)
    {
        Circle ac=new Circle();
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        float a=ac.area(radius);
        float b=ac.circumfereance(radius);
        System.out.println("Area of Circle: ");
        System.out.println(a);
        System.out.println("Circumfereance: ");
        System.out.println(b);
    }
}
