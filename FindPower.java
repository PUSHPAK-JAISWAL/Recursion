// this is a program to find the power of the number using the recursion

import java.util.*;

public class FindPower {

    public static int Power(int a,int b) {
        int mid =0; int result =0; int finalresult;
        if(b==1) {
            return a;
        }
        else {
            mid=b/2;
            result=Power(a, mid);
            finalresult = result* result;
            if(b%2==0) {
                return finalresult;
            }
            else {
                return a*finalresult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base : ");
        int base = sc.nextInt();
        System.out.println("Enter the Power : ");
        int power = sc.nextInt();

        int result=Power(base,power);
        System.out.println(result);
    }
}