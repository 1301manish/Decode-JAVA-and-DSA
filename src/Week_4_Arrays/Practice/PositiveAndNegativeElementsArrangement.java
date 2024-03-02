package Week_4_Arrays.Practice;

import java.util.Scanner;

public class PositiveAndNegativeElementsArrangement {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};
        int[] brr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>0){
                brr[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length ; i++) {
            if(arr[i]<0){
                brr[k++] = arr[i];
            }
        }
        for (int element: brr) {
            System.out.print(element + " ");
        }
    }
}
