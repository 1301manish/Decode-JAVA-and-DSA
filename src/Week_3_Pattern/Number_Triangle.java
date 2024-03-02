package Week_3_Pattern;

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10

public class Number_Triangle {
    public static void main(String[] args) {
        //Type 1
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 1; j <=i; j++) {  //Columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Type 2
        System.out.println();
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 1; j <=i; j++) {  //Columns
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //Type 3
        System.out.println();
        int k=1;
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 1; j <=i; j++) {  //Columns
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
