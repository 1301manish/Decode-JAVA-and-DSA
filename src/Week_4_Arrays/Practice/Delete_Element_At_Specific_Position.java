import java.util.Scanner;

public class Delete_Element_At_Specific_Position {
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

        // Input the position of the element to be deleted
        System.out.println("\nEnter the position of element to be deleted : ");
        int pos = sc.nextInt();

        // Shift elements to the left starting from the specified position
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Display modified array after deletion
        System.out.println("Array after deletion : ");
        for (int i = 0; i < n - 1; i++) { // Note: n has been decremented due to deletion
            System.out.print(arr[i] + " ");
        }
    }
}
