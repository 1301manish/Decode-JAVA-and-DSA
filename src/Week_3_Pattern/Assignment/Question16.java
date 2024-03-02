package Week_3_Pattern.Assignment;

public class Question16 {
    public static void main(String[] args) {
        int n = 4;
        for (int j = 1; j <= (n); j++) {
            System.out.print(j+" ");
        }
        for (int j = (n - 1); j >= 1; j--) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j+" ");
            }

            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("  ");
            }
            for (int j =(n - i); j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}