package Week_8_Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

// It is based on selection sort
public class Transform_Array_With_Extra_Space {
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


        int [] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
        }

        Arrays.sort(brr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (brr[i]==arr[j]){
                    arr[j]=i;
                    break;
                }
            }
        }

        System.out.println("\nResultant Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
