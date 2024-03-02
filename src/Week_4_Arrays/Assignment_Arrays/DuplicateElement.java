package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
WAP to find the duplicate elements from the given array of elements.
 */
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n; j++) {
                if (arr[i]==arr[j]){
                    flag = false;
                    System.out.println("Duplicate element is "+ arr[i]);
                    break;
                }
            }
            if (flag==false) break;
        }
        if (flag) System.out.println("Array do not have duplicate element");
    }
}
