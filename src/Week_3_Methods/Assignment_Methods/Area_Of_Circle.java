package Week_3_Methods.Assignment_Methods;

import java.util.Scanner;

public class Area_Of_Circle {
    public static double Area(int r){
        return Math.PI *r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        System.out.println("The area of circle with radius "+r+" is "+Area(r));
    }
}
