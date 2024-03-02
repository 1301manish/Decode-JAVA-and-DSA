package Week_2_Loops.Practice;

import java.util.Scanner;

public class Sum_Of_Two_Prime_Is_Prime_Method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp1=0;
        int temp2=0;
        int i;
        int j;
        for (i = 2; i <=(num/2); i++) {
            int temp3=i;
            int temp4=num-i;
            for( j =2; j<temp3; j++) {
                if (temp3 % j == 0) {
                    temp1++;
                }
            }
            for( int k =2; k<temp4; k++) {
                if(temp4%k==0){
                    temp2++;
                }
            }
            if(temp1==0 && temp2==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
                break;
            }
            }

        }
        }

