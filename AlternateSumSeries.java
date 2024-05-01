// this is a program to implement the Alternate sum series in java using 
// recursion

import java.util.*;

public class AlternateSumSeries {

    public static int Alternate(int n) {
        if(n==0) {
            return 0;
        }

        if(n%2==0) {
            return Alternate(n-1)-n;
        }
        else {
            return Alternate(n-1)+n;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num =sc.nextInt();

        int result=Alternate(num);
        System.out.println(result);
    }
}