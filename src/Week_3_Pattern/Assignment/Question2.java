package Week_3_Pattern.Assignment;
/*
1 2 3 4
1 2 3
1 2
1
 */
public class Question2 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
