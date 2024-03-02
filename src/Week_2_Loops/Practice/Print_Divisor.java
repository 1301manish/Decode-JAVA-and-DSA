package Week_2_Loops.Practice;

import java.util.Scanner;

public class Print_Divisor {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Time complexity = O(n^1/2)
//        for (int i = 1; i*i <=num ; i++) {
//            if(num % i == 0){
//                System.out.println(i);
//                if(num/i!=i){
//                    System.out.println(num/i);
//                }
//            }
//        }

        //Divisors in ascending order
        int i = 0;
        for (i = 1; i*i <=num ; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
        for ( ; i>=1 ; i--) {
            if(num%i == 0 && num/i != i){
                    System.out.println(num/i);
                }
        }


        //Time complexity = O(n)
//        for (int i = 1; i<=num ; i++){
//            if(num % i == 0){
//                System.out.println(i);
//            }
//        }
    }
}
