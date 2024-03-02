package Week_3_Pattern.Assignment;
/*
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
 */
public class Question1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= 4; j++) {  //Columns
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
