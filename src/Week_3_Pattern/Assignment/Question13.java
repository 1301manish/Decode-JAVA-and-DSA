package Week_3_Pattern.Assignment;

public class Question13 {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
