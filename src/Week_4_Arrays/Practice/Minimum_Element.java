package Week_4_Arrays.Practice;

import java.util.Arrays;

/*Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
for calculating the minimum element.*/
public class Minimum_Element {
    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 8, 1, 0, -4};

        Arrays.sort(arr);
        int min = arr[0];
        /*int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }*/
        System.out.println("The minimum element in the given array is : " + min);
    }
}
