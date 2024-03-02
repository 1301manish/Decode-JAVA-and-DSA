package Week_2_Loops;

public class PrintEven {
    public static void main(String[] args) {
        System.out.println("Even Numbers");

        for (int i = 2; i <= 100; i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for (int i = 1; i <= 100; i=i+2) {
            System.out.print(i+" ");
        }
    }
}