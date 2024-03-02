package Week_4_Arrays;

import java.util.Arrays;

public class ArrayBuiltinFunction {
    public static void main(String[] args) {
        int[] arr = {65,64,86,89,36,90,47,47,65};
        System.out.print("Orignal array : ");
        for(int element : arr){
            System.out.print(element + " ");
        }
        Arrays.sort(arr);
        System.out.print("\nSorted array : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        //Printing array
        System.out.println("\n"+Arrays.toString(arr));
    }
}
