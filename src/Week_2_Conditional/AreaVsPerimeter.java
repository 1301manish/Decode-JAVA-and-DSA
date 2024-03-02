package Week_2_Conditional;

import java.util.Scanner;

public class AreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle : ");
        double b = sc.nextDouble();
        double area = l*b;
        double perimeter = 2*(l+b);
        System.out.println("Area of rectangle s : "+area);
        System.out.println("Perimeter of rectangle s : "+perimeter);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter.");
        }
        else{
            System.out.println("Area is less than perimeter.");
        }
    }
}
