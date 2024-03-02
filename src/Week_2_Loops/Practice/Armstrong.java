package Week_2_Loops.Practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int temp = sc.nextInt();
        int count = 0;
        int num1= temp;
        int num2= temp;
        int sum=0;

        while (num1!=0) {
            num1 = num1 / 10;
            count++;
        }
        while (num2!=0){
            int i = num2%10;
            num2 = num2/10;
            int ans = (int)(Math.pow(i,count));
            sum=sum+ans;
        }
        if(temp==sum){
        System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
