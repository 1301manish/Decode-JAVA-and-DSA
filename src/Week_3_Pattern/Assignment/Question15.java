package Week_3_Pattern.Assignment;

public class Question15 {
    public static void main(String[] args) {
        int n = 4;
        for (int j = 1; j <=(2*n-1) ;j++) {
            System.out.print((char)(64+j)+" ");
        }
        System.out.println();
        for (int i = 1; i <=n; i++) {
            int k = 1;
            for (int j = 1; j <=(n-i); j++) {
                System.out.print((char)(k++ + 64)+" ");
            }

            for (int j = 1; j <=((2*i)-1) ; j++) {
                System.out.print("  ");
                k++;
            }

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print((char)(k++ + 64)+" ");
            }
            System.out.println();
        }
    }
}
