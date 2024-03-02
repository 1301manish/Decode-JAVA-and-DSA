package Week_4_Arrays.Extra_Practice;

import java.util.Scanner;

public class Occurrence_Of_Elements {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be counted : ");
        int x = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(arr[i]==x) {
                count++;
            }
        }
        System.out.println(x + " occured " + count + " number of times");
    }
}
