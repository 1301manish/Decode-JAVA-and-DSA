package Week_3_Pattern;
/*

  *      *
    *  *
     *
   *   *
 *       *

 */
public class Star_Cross {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {      //Rows
            for (int j = 1; j <= 5; j++) {  //Columns
                //if(i==j || i+j==n+1)
                if(i==j || i+j==5+1){
                    System.out.print("* ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
