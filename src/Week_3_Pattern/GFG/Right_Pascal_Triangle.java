package Week_3_Pattern.GFG;

public class Right_Pascal_Triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=i; j++) {
                if (j<=i  && i<=n){
                    System.out.print("* ");
                }
                if ((i+j)<=(2*n) && i>n){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
