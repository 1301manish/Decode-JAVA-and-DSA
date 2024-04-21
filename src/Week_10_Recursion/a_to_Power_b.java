package Week_10_Recursion;

import java.util.Scanner;

public class a_to_Power_b {

    public static int pow1(int a, int b){ //TC=O(b)
        if (b==0) return 1;
        int ans = a*pow1(a, b-1);
        return ans;
    }


    public static int pow2(int a, int b){ //TC=O(log b)
        if (b==0) return 1;
        int ans = pow2(a, b/2);
        if (b%2==0) return ans*ans;
        else return a*ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println( " TC=O(b) " + a + "^" +b+ " is " + pow1(a,b));
        System.out.println( " TC=O(log b) " + a + "^" +b+ " is " + pow2(a,b));
    }
}
