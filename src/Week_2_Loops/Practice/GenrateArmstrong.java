package Week_2_Loops.Practice;

import java.util.Scanner;

public class GenrateArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = sc.nextInt();
        for (int i = 1; i <=range; i++) {

            int num1= i;
            int num2= i;
            int sum=0;
            int count = 0;

            while (num1!=0) {
                num1 = num1 / 10;
                count++;
            }
            while (num2!=0){
                int x = num2%10;
                num2 = num2/10;
                int ans = (int)(Math.pow(x,count));
                sum=sum+ans;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
