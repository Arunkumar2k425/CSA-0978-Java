import java.util.Scanner;
public class powerofthree{
    public static boolean ispowerofthree(int n){
        if(n<0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the n value:");
        int n = scanner.nextInt();
        if(ispowerofthree(n)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
        scanner.close();
    }
 }