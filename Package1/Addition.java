package Package1;
import java.util.Scanner;
        
public class Addition 
{
    public int add(int a, int b)
    {
        return a+b;
    }
    
    public static void main(String[] args)
    {
        Addition ad = new Addition();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int c = ad.add(a, b);
        System.out.println("Addition is: ");
        System.out.println(c);
    }
}
