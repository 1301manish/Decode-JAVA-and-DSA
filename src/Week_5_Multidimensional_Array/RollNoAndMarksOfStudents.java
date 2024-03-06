package Week_5_Multidimensional_Array;

import java.util.Scanner;
/*
Write a program to store roll number and marks
obtained by 4 students side by side in a matrix.
 */
public class RollNoAndMarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [4][2];
        System.out.println("Enter roll number then marks of 4 students");
        for (int i = 0; i <4; i++) {
            System.out.println("Enter the details of " + (i+1) + " student : ");
            for (int j = 0; j <2; j++) {
                if(j==0){
                    System.out.print("Enter the roll number : ");
                }
                else{
                    System.out.print("Enter the marks : ");
                }
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Table of student's marks and roll number : ");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
