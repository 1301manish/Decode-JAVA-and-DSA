package Week_4_Arrays;

import java.util.Scanner;

public class Doublet_Sum_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target : ");
        int x = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == x){
                    System.out.println(arr[i] + "+" + arr[j] + " = " + x );
                }
            }
        }
    }
}
