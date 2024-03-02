package Week_4_Arrays;

import java.util.Scanner;

public class BasicsOfArray {
    public static void main(String[] args) {

        //int[] arr; Declaration
        //arr = new int[5]; Memory allocation

        int[] arr = new int[5];

        //Initialising every single element
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //Printing the elements
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.println(arr[4] + " ");
        //Updating the elements
        arr[0] = 100;
        //Printing the updated element
        System.out.println("Updated element : ");
        System.out.println(arr[0] + " ");

        arr[0] += 10;
        System.out.print(arr[0] + " ");



        //-->> Input using loop
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the array : ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        //Input
        System.out.println("Enter the elements : ");
        for (int i = 0; i <= (size-1) ; i++) {
            arr1[i] = sc.nextInt();
        }
        //Output
        System.out.print("Output : ");
        for (int i = 0; i <= (size-1) ; i++) {
            System.out.print(arr1[i] + " ");
        }
        //Initialising and declaring the array at the same time
        System.out.println("\nInitialising and declaring the array at the same time");
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int size1 = arr2.length;
        for (int i = 0; i < size1 ; i++) {
            System.out.print(arr2[i] + " ");
        }
        /*
        Note :
        int a(5);                 -->> Wrong
        int size = 5 , b[size];   -->> Wrong
        int c = {1,2,3,4,5};      -->> Wrong
         */
    }
}
