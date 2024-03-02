package Week_3_Pattern.Assignment;

public class Question8 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 1; j <=i; j++) {  //Columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
