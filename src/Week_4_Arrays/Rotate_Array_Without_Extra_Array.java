package Week_4_Arrays;

import java.util.Scanner;

public class Rotate_Array_Without_Extra_Array {
    public static void swap(int[] arr,int i ,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.print("Enter the number of digits to be rotated : ");
        int k = sc.nextInt();
        k = k%n;

        swap(arr,0 ,n-k-1);
        swap(arr,n-k ,n-1);
        swap(arr,0 ,n-1);
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
