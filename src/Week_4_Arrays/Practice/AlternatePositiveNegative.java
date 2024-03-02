import java.util.Arrays;
import java.util.Scanner;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        // Input the elements of the array
        System.out.println("Enter the elements of the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count positive and negative numbers
        int cp = 0;
        int cn = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                cn++;
            else
                cp++;
        }

        // Separate positive and negative numbers into two arrays
        int[] brr = new int[cp];
        int[] crr = new int[cn];
        int k = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                crr[k++] = arr[i];
            } else {
                brr[m++] = arr[i];
            }
        }

        // Merge the two arrays alternatively (positive, negative, positive, negative, ...)
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < cn && y < cp) {
            arr[z++] = crr[x++];
            arr[z++] = brr[y++];
        }

        // Add any remaining negative numbers
        while (x < cn) {
            arr[z++] = crr[x++];
        }

        // Add any remaining positive numbers
        while (y < cp) {
            arr[z++] = brr[y++];
        }

        // Print the resulted array
        System.out.println("Resulted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
