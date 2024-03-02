package Week_3_Pattern;
/*
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7
 */
public class Number_Bridge {
    public static void main(String[] args) {
            int n = 4;
            for (int j = 1; j <= (2 * n - 1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            for (int i = 1; i <= n; i++) {
                int k = 1;
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(k++ +" ");
                }

                for (int j = 1; j <= ((2 * i) - 1); j++) {
                    System.out.print("  ");
                    k++;
                }
                for (int j =1; j <=(n - i) ; j++) {
                    System.out.print(k++ +" ");
                }
                System.out.println();
            }
        }
    }