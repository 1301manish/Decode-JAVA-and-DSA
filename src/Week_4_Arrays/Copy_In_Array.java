package Week_4_Arrays;

import java.util.Arrays;

public class Copy_In_Array {
    public static void main(String[] args) {
        int[] arr = {65,68,34,78,43,87,32};
        for (int element: arr) {
            System.out.print(element+ " ");
        }
        System.out.println();

        //Shallow copy

        int[] brr = arr;
        brr[0] = 10;
        System.out.println("arr = "+arr[0]);
        System.out.println("brr = "+brr[0]);
        System.out.println();

        //Deep Copy -->> Method 1

        int[] crr = Arrays.copyOf(arr,arr.length);
        crr[0] = 20;
        System.out.println("arr = "+arr[0]);
        System.out.println("crr = "+crr[0]);
        System.out.println();

        //Deep Copy -->> Method 2

        int[] drr = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            drr[i] = arr[i];
        }
        drr[0] = 99;
        System.out.println("arr = "+arr[0]);
        System.out.println("drr = "+drr[0]);
        System.out.println();

        //Deep Copy -->> Method 3

        int[] err = arr.clone();
        err[0] = 35;
        System.out.println("arr = "+arr[0]);
        System.out.println("drr = "+err[0]);
        System.out.println();
    }
}
