package Week_2_Loops.Practice;

import java.util.Scanner;

public class Print_Prime_Factors {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <=num; i++) {
            boolean flag = true;
            int res = num%i;
            if (res==0){
                for (int j = 2; j*j<= i ; j++) {
                    if (i%j==0){
                        flag = false;
                        break;
                    }
                }
                if (flag) System.out.println(i);
            }
        }
        //Another approach
        int i = 2;
        while (i*i<=num){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
            i++;
        }
        //as i*i<=n then the value of i cannot reach more than n^1/2
        // so when we devide by i quotient cannot be 1.So in case of prime number
        // quotient will always be >than 1,n=n/i therefore n is only the quotient
        if(num>1){
            System.out.println(num);
        }
    }
}
