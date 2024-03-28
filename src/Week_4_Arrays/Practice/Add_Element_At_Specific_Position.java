import java.util.Scanner;

public class Add_Element_At_Specific_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        // Input the elements of the array
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[50]; // Assuming max size of the array is 50
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("Original Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Input the element to be added
        System.out.print("\nEnter the element to be added : ");
        int ele = sc.nextInt();

        // Input the position where the element is to be added
        System.out.print("Enter the position where element is to be added : ");
        int pos = sc.nextInt();

        // Shift elements to the right to make space for the new element
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element at the specified position
        arr[pos] = ele;

        // Display modified array
        System.out.println("Array after insertion : ");
        for (int i = 0; i <= n; i++) { // Note: n has been incremented
            System.out.print(arr[i] + " ");
        }
    }
}
