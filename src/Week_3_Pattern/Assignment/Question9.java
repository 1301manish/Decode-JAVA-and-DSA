package Week_3_Pattern.Assignment;

public class Question9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}