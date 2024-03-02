package Week_2_Loops;

import java.util.Scanner;

public class CheckCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
        else if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}
