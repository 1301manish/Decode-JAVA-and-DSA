package Week_3_Pattern.Assignment;

public class Question22 {
    public static void main(String[] args) {
        int n = 4;
        //Star Bridge
        for (int j = 1; j <=(2*n-1) ;j++) {  //First line stars
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=n-1; i++) {     //Rows
            for (int j = 1; j <=(n-i); j++) {       //Inverted Star Triangle
                System.out.print("* ");
            }

            for (int j = 1; j <=((2*i)-1) ; j++) {     //Spaces
                System.out.print("  ");
            }

            for (int j = 1; j <=(n-i) ; j++) {     //Inverted Star Triangle
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Star Bridge
        for (int i = n-2; i >=1; i--) {
            for (int j = 1; j <=(n-i); j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <=((2*i)-1) ; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 1; j <=(2*n-1) ;j++) {
            System.out.print("* ");
        }
    }
}
