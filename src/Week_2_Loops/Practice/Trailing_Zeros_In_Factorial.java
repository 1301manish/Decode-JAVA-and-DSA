package Week_2_Loops.Practice;

import java.util.Scanner;

public class Trailing_Zeros_In_Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int powOf5=5;
        int result = 0;
        while (n>=powOf5){
            result=result+(n/powOf5);
            powOf5=powOf5*5;
        }
        System.out.println("Number of trailing zeros : "+result);



//        Noob approach

//        int pro=1;
//        for (int i = 1; i <=n; i++) {
//            pro*=i;
//        }
//        int count = 0;
//        while(pro>0){
//            int i = pro%10;
//            if(i==0){
//                count++;
//            }
//            else{
//                break;
//            }
//            pro=pro/10;
//        }
//        System.out.println(count);
    }
}
