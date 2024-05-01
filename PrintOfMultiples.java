// this is a program to print the multipes with use of recursion

import java.util.*;

public class PrintOfMultiples {

    public static void printMul(int number,int n) {
        if(n==1) {
            System.out.println(number);
            return;
        }
        printMul(number, n-1);
        System.out.println(number*n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for Multiples : ");
        int number = sc.nextInt();
        System.out.println("Enter the Number for iteration. : ");
        int n=sc.nextInt();

        printMul(number,n);
        System.out.println();
    }
}