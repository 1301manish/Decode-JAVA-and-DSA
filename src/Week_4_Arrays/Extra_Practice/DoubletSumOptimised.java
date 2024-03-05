package Week_4_Arrays.Extra_Practice;

import java.util.Scanner;
//In this question we have applied one based indexing
public class DoubletSumOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int [n+1];
        System.out.println("Enter the elements of the array : ");
        for (int i = 1; i <= n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int i = 1;
        int j = n;
        boolean flag = true;
        while (i<j){
            int sum = arr[i] + arr[j];
            if (sum == target){
                System.out.println("Element found at "+i+","+j);
                flag = false;
                break;
            }
            else if (sum < target){
                i++;
            }
            else {
                j--;
            }
        }
        if (flag) System.out.println(-1);
    }
}
