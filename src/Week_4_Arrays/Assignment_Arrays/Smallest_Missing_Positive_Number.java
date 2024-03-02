package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;
/*
WAP to find the smallest missing positive element in the sorted Array that contains only positive
elements
 */
public class Smallest_Missing_Positive_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i <n; i++) {
            if(arr[i]!=x){
                System.out.println("The missing element is "+x);
                break;
            }
            else x++;
        }
    }
}
