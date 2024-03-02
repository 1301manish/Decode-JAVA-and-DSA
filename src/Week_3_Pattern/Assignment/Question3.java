package Week_3_Pattern.Assignment;
/*
A
A B
A B C
A B C D
 */
public class Question3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      //Rows
            int k = 65;
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print((char)k + " ");
                k++;
            }
            System.out.println();
        }
    }

}
