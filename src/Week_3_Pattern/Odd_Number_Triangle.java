package Week_3_Pattern;
//1
//1 3
//1 3 5
//1 3 5 7
public class Odd_Number_Triangle {
    public static void main(String[] args) {
        //Method 1
        //Concept : (2 * j - 1)
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
        //Method 2
        //Concept : Using AP (2*n-1)
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= (2 * i - 1); j = j + 2) {  //Columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Method 3
        for (int i = 1; i <= 4; i++) {      //Rows
            int k = 1;
            for (int j = 1; j <= i; j++) {  //Columns
                System.out.print(k + " ");
                k+=2;
            }
            System.out.println();
        }
    }
}