// this is a program in java to find factorial in java using recursion
import java.util.*;

public class FindFactorial {
    public static int factorial(int number) {
        if(number ==0 || number ==1) {
            return 1;
        }
        else {
            return number*factorial(number-1);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the Number ");
        number =sc.nextInt();
        int fact=factorial(number);
        System.out.println("The Factorial is : "+fact);
    }
}