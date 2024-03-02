package Week_1_Basics;

public class AreaOfACircle {
    public static void main(String[] args) {


        //area of circle

        double r = 6.9;
        double a = 3.141592*r*r;
        System.out.println("The area of circle with radius "+r+" is : "+a);


        //volume of sphere

        double v = (4*r*r*r*3.141592)/3;
        System.out.println("The volume of sphere with radius "+r+" is : "+v);
    }
}
