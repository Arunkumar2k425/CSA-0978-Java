import java.util.*;
class Average
{
    public static void main(String[] args)
    {
        int a,b,c,Avg;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of a & b:");
        a=scan.nextInt();
        b=scan.nextInt();
        c=a+b;
        Avg=c/2;
        System.out.println("sum is " +c);
        System.out.println("Average is " +Avg); 
        
    }
}