package Week_3_Pattern.Kunal_Kushwaha;

public class abcde {
    public static void main(String[] args) {
        int k = 1;
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                if(k%2==0) System.out.print((char)(k + 64) + " ");
                else System.out.print((char)(k + 96) + " ");
                k++;
            }
            System.out.println();
        }
    }
}
