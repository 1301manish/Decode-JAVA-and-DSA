package Week_2_Conditional;

import java.util.Scanner;

public class GradeOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int a = sc.nextInt();
//        if(a>=81 && a<=100){
//            System.out.println("Very Good");
//        }
//        if(a>=61 && a<=80){
//            System.out.println("Good");
//        }
//        if(a>=41 && a<=60){
//            System.out.println("Average");
//        }
//        if(a<=40){
//            System.out.println("Fail");
//        }



        //Power of else if

        if(a>=81 && a<=100){
            System.out.println("Very Good");
        }
        else if(a>=61){
            System.out.println("Good");
        }
        else if(a>=41){
            System.out.println("Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}