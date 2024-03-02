package Week_2_Loops.Practice;

import java.util.Scanner;

public class GeneratePrime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                boolean flag = true;//prime
                for (int j = 2; j*j<= i; j++) {
                    if (i % j == 0) {
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                }
            }
        }
}