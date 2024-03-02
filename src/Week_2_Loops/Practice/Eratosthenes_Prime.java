package Week_2_Loops.Practice;
import java.util.Scanner;
public class Eratosthenes_Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean[] prime = new boolean[n+1];
        for (int i = 2; i <= n ; i++) {
            if(prime[i]==false){
                for (int j = 2*i; j <=n; j=j+i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }
}
