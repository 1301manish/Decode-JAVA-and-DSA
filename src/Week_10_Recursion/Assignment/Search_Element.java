package Week_10_Recursion.Assignment;

import java.util.Scanner;
/*
Search an element in a given array. Return the index of the element if the element is found, otherwise return -1.
 */
public class Search_Element {
    public static int searchElement(int [] arr, int i, int target){
        if (i== arr.length) return -1;
        if (arr[i]==target) return i;
        return searchElement(arr,i+1,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int ans = searchElement(arr,0,target);
        System.out.print("Output : " + ans);
    }
}
