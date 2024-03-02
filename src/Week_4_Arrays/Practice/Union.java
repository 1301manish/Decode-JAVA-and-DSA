package Week_4_Arrays.Practice;

import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = {1,2,3};
        int size = arr.length+ brr.length;
        int[] crr = new int[size];
        int k = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <k; j++) {
                if(arr[i]!=crr[j]){
                    crr[k++] = arr[i];
                    break;
                }
            }
        }
        for (int i = 0; i < brr.length ; i++) {
            for (int j = 0; j <k; j++) {
                if(brr[i]!=crr[j]){
                    crr[k++] = brr[i];
                    break;
                }
            }
        }
        for (int element : crr) {
            System.out.print(element + " ");
        }
    }
}
