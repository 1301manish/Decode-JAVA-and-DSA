package Week_2_Loops;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        //Method 1
        int an =(int) (1*Math.pow(2,n-1));

        for (int i = 1; i <= an; i = i*2) {
            System.out.print( i + " ");
        }
        //Method 2
        System.out.println();
        int a = 1 , cr=2;
        for(int i =1; i<=n ; i++){
            System.out.print(a+ " ");
            a*=cr;
        }
    }
}
