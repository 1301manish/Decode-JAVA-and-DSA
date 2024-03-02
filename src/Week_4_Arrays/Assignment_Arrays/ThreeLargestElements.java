package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;

public class ThreeLargestElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < size ; i++) {
            if(arr[i]>max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i]>max2){
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i]>max3) {
                max3=arr[i];
            }
        }
        System.out.println("The first largest element in the array is : " + max1);
        System.out.println("The second largest element in the array is : " + max2);
        System.out.println("The third largest element in the array is : " + max3);
    }
}

