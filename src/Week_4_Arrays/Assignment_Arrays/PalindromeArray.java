package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
If an array arr contains n elements, then check if the given array is a palindrome or not .
 */
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n/2; i++) {
            if (arr[i]!=arr[n-i-1]){
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("This is palindrome array");
        else System.out.println("This is not palindrome array");
    }
}
