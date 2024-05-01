// this is a program to give the nth fibonaci number 
import java.util.*;

public class Fibonacci {

    public static int fibonacci(int n) {
        int result;
        if(n<=1) {
            return n;
        }
        else {
            result=fibonacci(n-1)+fibonacci(n-2);
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number For the Fibonacci. : ");
        int number = sc.nextInt();
        int result=fibonacci(number);
        System.out.println(result);
    }
}