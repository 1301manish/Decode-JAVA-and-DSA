package Week_2_Conditional;

import java.util.Scanner;

public class GreatestOfThreeByNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        //Greatest number
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest.");
            }
            else System.out.println(c+ " is greatest.");
        }
        else{
            if(c>b){
                System.out.println(c+ " is greatest.");
            }
            else{
                System.out.println(b+ " is greatest.");
            }
        }

        //Smallest number
        if(a<b){
            if(a<c){
                System.out.println(a+" is smallest.");
            }
            else System.out.println(c+ " is smallest.");
        }
        else{
            if(c<b){
                System.out.println(c+ " is smallest.");
            }
            else{
                System.out.println(b+ " is smallest.");
            }
        }
    }
}
