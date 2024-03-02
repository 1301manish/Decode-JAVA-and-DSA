package Week_3_Pattern;
//        1
//        2 3
//        4 5 6
//        7 8 9 10
public class Floyds_Triangle {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print((k++) + " ");
            }
            System.out.println();
        }
    }
}
