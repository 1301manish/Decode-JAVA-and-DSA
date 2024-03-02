package Week_2_Loops;

import java.util.Scanner;

public class Table_Of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table has to be printed : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n*i + " ");
        }
    }
}
