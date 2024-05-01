// this is a program to 

import java.util.Scanner;

public class CountWays {
    // function definition
    public static int countNum(int n) {
        int result=0;
        if(n<=1) {
            return n;
        }
        else {
            result = countNum(n-1)+countNum(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Stairs : ");
        int n = sc.nextInt();

        // funtion calling
        int result = countNum(n+1);
        System.out.println("Number of Ways is : "+result);
    }
}
