package Week_3_Methods;

import java.util.Scanner;

public class GCD {
    //Method -->> 1 -->> Optimised
    static void HCF1(int a , int b){
        int hcf = 1;
        for (int i = Math.min(a,b); i >=1 ; i--) {
            if(a%i == 0 && b%i ==0){
                System.out.println("HCF of "+a+" and "+b+" is : "+i);
                break;
            }
        }
    }
    //Method -->> 2
    static void HCF2(int a , int b){
        int hcf = 1;
        for (int i = 1; i <=Math.min(a,b) ; i++) {
            if(a%i == 0 && b%i ==0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is : "+hcf);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        HCF1(a,b);
        HCF2(a,b);
    }
}
