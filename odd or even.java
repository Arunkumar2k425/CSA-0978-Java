import java.util.*;
class Oddoreven
{
    public static void main(String[] args)
    {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=scan.nextInt();
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("odd"); 
        
    }
}