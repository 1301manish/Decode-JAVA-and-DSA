package Week_8_Basic_Sorting;

import java.util.Scanner;

public class Transform_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        // Creating an array of given size
        int[] arr = new int[n];

        // Getting elements of the array from the user
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j]<min && arr[j]>0){
                    min=arr[j];
                    minIdx=j;
                }
            }
            arr[minIdx]=x;
            x--;
        }
        System.out.println("Resultant Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]*-1 + " ");
        }
    }
}
