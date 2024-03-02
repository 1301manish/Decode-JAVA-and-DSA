package Week_4_Arrays.Practice;

import java.util.Scanner;

/*Given an unsorted array A of size N that contains only non-negative integers, find a
 continuous sub-array which adds to a given number S.
 In case of multiple subarrays, return the subarray which comes first on moving from left
 to right.
 You need to print the start and end index of answer subarray.*/
public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");

        int n = scn.nextInt();

        int s = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();

        }

        int i = 0;

        int j = 0;

        int sum = 0;

        while (j < n) {

            sum += arr[j];

            if (sum > s) {

                while (sum > s && i < j) {

                    sum -= arr[i];

                    i++;

                }

            }

            if (sum == s) {

                System.out.print(i + " ");

                System.out.print(j);

                break;

            }

            j++;
        }
    }
}