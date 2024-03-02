package Week_4_Arrays.Extra_Practice;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        boolean flag = false ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int x = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(arr[i]==x) {
                System.out.println(x + " Found at index " + i);
                flag = true ;
                break;
            }
        }
        if(!flag) System.out.println("Element not found");
    }
}
