package Week_3_Pattern.Practice;

public class Numerical_Rectangular {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            for (int j = i; j <=7 ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
