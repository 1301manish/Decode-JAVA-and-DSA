package Week_3_Pattern;
//                     *
//                   * * *
//                 * * * * *
//               * * * * * * *
public class Star_Pyramid {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=((2*i)-1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Method 2
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst = nst+2;
        }
    }
}
