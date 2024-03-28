package Week_5_Multidimensional_Array.Practice;

import java.util.Scanner;
/*
. Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
 row and column index.
 */
public class Search_In_Matrix {

    public static void searchElement(int [][] arr, int ele){
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j]==ele){
                    System.out.println("Element found at index : [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        System.out.println("Enter "+(row*col)+" elements : ");
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched : ");
        int ele = sc.nextInt();
        searchElement(arr,ele);
    }
}
