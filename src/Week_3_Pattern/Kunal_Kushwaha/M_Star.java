package Week_3_Pattern.Kunal_Kushwaha;

public class M_Star {
    public static void main(String[] args) {
        int n =3;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n ; j++) {
                if(j==i && i!=n) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j==1 || j==2*i-1) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(i+j==n+1 && i!=n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
