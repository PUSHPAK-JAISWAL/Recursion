// this is a program to make sum of digits using the recursion
import java.util.*;

public class SumOfDigits {

    public static int sum(int n) {
        if(n<=0) {
            return n;
        }
        else {
            return (n%10)+sum(n/10);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int digits = sc.nextInt();

        int result = sum(digits);
        System.out.println(result);
    }
}