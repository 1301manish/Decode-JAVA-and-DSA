package Week_4_Arrays.Assignment_Arrays;

import java.util.Scanner;

//One pass solution
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;

        System.out.println("Orignal Array : ");
        for (int m = 0; m<arr.length; m++){
            System.out.print(arr[m] + " ");
        }
        while (i<j){
            if (arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else{
                i++;
            }
        }
        //Display
        System.out.println("\nArray after sorting");
        for (int m = 0; m<arr.length; m++){
            System.out.print(arr[m] + " ");
        }
    }
}
