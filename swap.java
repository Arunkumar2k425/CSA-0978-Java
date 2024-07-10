import java.util.*;
class Swap
{
    public static void main(String[] args)
    {
        int a,b,t;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of a & b:");
        a=scan.nextInt();
        b=scan.nextInt();
        t=a;
        a=b;
        b=t;
        System.out.println("After swapping");
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        
    }
}