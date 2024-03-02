package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
Find the second largest element in the given Array in one pass.
 */
public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < size ; i++) {
            if(arr[i]>max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i]>max2){
                max2 = arr[i];
            }
        }
        System.out.print("The second maximum element in the array is : " + max2);
    }
}
