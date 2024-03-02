package Week_1_Basics;

public class UpdationsOfVariables {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        x = 10;
        System.out.println(x);
        x = x +7;
        System.out.println(x);
        x= x-20;
        System.out.println(x);
        x=10;
        System.out.println(x);
        x=x*2;
        System.out.println(x);
        x=x/4;
        System.out.println(x);

        System.out.println("After using shortcut");

        //Shortcuts
        System.out.println(x);
        x = 10;
        System.out.println(x);
        x +=7;
        System.out.println(x);
        x-=20;
        System.out.println(x);
        x=10;
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x/=4;
        System.out.println(x);
        //Shortcut is processed more fast in the computer.
    }
}
