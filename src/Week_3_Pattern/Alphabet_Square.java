package Week_3_Pattern;
//        A B C D
//        A B C D
//        A B C D
//        A B C D
//
//        A A A A
//        B B B B
//        C C C C
//        D D D D
//
//        a b c d
//        a b c d
//        a b c d
//        a b c d
//
//        a a a a
//        b b b b
//        c c c c
//        d d d d
public class Alphabet_Square {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 65; j <=68; j++) {  //Columns
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        System.out.println();
            for (int i = 65; i <=68; i++) {      //Rows
                for (int j = 1; j <=4; j++) {  //Columns
                    System.out.print((char)i+" ");
                }
                System.out.println();
            }
        System.out.println();
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 97; j <=100; j++) {  //Columns
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 97; i <=100; i++) {      //Rows
            for (int j = 1; j <=4; j++) {  //Columns
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}
