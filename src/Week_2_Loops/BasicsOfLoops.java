package Week_2_Loops;

import java.util.Scanner;

public class BasicsOfLoops {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0 ; i<n ; i++){
            System.out.println("Hello World !!!!!");
        }
        int i=0;
        for (;i<n;){
            System.out.println("Manish");
            i++;
        }
    }
}
