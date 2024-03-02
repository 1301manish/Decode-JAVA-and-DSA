package Week_2_Conditional;

import java.util.Scanner;

public class IdentifyTheQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y coordinate : ");
        int y = sc.nextInt();
        if (x>0 && y>0){
            System.out.println("First Quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("Second Quadrant");
        }
        else if (x<0 && y<0){
            System.out.println("Third Quadrant");
        }
        else if (x==0 && y==0){                    //Sequence matters
            System.out.println("Lies at origin");
        }
        else if (x==0){
            System.out.println("Lies at Y axis");
        }
        else if (y==0){
            System.out.println("Lies at X axis");
        }
        else {
            System.out.println("Fourth Quadrant");
        }
    }
}
