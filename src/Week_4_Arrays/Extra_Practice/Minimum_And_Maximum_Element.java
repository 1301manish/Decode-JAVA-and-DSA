package Week_4_Arrays.Extra_Practice;
import java.util.Scanner;
import java.util.Arrays;
import static java.util.Arrays.*;

public class Minimum_And_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};

        System.out.println("Minimum element: "+ ans[0]);
        System.out.println("Maximum element: "+ ans[ans.length-1]);

        System.out.println(Arrays.toString(ans));

        /*
        K th element can access by
        1.We have to sort array
        2.after sorting our kth smallest element will be at index [kth-1]
        3 for kth highest [arr.length-k]

        static int[] KSmallestAndLargest(int[] arr, int k){
        Arrays.sort(arr);
        int[] ans={arr[k-1], arr[arr.length-k]};
        return ans;
    }
        */
    }
}
