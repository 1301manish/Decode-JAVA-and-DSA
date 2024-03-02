package Week_4_Arrays;

import java.util.Scanner;

public class Students_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the marks of students : ");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size ; i++) {
            if(arr[i]< 35){
                System.out.println("Roll number of the student who failed is : " + i);
            }
        }
    }
}
