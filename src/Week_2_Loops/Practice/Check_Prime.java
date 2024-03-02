package Week_2_Loops.Practice;

import java.util.Scanner;
//O(n^1/2) Much more efficient than previous one because of jump by 6
public class Check_Prime {
    public static boolean CheckPrime(int n){
        if (n == 1 || n == 0) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(CheckPrime(n));
            }

        //O(n)
//        boolean isPrime = true;
//        for (int i = 2; i<=n/2 ; i++) {
//            if(n%i==0){
//                isPrime=false;
//                break;
//            }
//        }
//        if(n==1 || n==0) System.out.println("Neither prime nor composite");
//        else if(isPrime) System.out.println("Prime");
//        else System.out.println("Composite");


        //O(n^1/2)
//        boolean isPrime1 = true;
//        //for (int i = 2; i<=math.sqrt(n) ; i++)
//        for (int i = 2; i*i<=n ; i++) {
//            if(n%i==0){
//                isPrime1=false;
//                break;
//            }
//        }
//        if(n==1 || n==0) System.out.println("Neither prime nor composite");
//        else if(isPrime1) System.out.println("Prime");
//        else System.out.println("Composite");
}
