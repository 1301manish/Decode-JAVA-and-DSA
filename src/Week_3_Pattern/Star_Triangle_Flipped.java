package Week_3_Pattern;

public class Star_Triangle_Flipped {
    public static void main(String[] args) {
        //Method 1
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= 4 - i; j++) {  //Columns
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        //Method 2
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= 4; j++) {  //Columns
                if (i + j > 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}