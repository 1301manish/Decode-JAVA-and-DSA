package Week_3_Pattern;
//                    1
//                  1 2
//                1 2 3
//              1 2 3 4
public class Number_Triangle_Flipped {
    public static void main(String[] args) {
        //m - 1
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // m - 2
        for(int i = 0; i < n; i++) {
            int s = 1;
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                      System.out.print(" ");
                }
                else{
                        System.out.print(s++);
                    }

            }
            System.out.println();
        }
    }
}
