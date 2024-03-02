package Week_4_Arrays.Extra_Practice;

import java.util.Scanner;

public class Last_Occurrence {
    public static void main(String[] args) {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int x = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(arr[i]==x) {
                index = i;
            }
        }
        System.out.println("Last index of " + x + " is " + index);
    }
}
