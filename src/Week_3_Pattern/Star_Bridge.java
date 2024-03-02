package Week_3_Pattern;
/*
 * * * * * * * * * * *
 * * * * *   * * * * *
 * * * *       * * * *
 * * *           * * *
 * *               * *
 *                   *
 */
public class Star_Bridge {
    public static void main(String[] args) {
        int n = 6;
        for (int j = 1; j <=(2*n-1) ;j++) {          //First Line Stars
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=n; i++) {                //Rows
            for (int j = 1; j <=(n-i); j++) {          //Inverted Triangle Star
                System.out.print("* ");
            }

            for (int j = 1; j <=((2*i)-1) ; j++) {        //Triangle Space
                System.out.print("  ");
            }

            for (int j = 1; j <=(n-i) ; j++) {              //Inverted Triangle Star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
