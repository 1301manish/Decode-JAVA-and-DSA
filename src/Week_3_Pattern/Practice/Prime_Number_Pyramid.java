package Week_3_Pattern.Practice;

public class Prime_Number_Pyramid {
    public static void main(String[] args) {
        int n =2;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                boolean flag = true;//prime
                for (int k = 2; k*k <= n; k++) {
                    if (n % k == 0) {
                        flag=false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(n+" ");
                }
                else j--;
                n++;
            }
            System.out.println();
        }
    }
}
