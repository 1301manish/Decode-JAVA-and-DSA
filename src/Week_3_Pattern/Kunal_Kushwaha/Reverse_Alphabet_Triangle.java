package Week_3_Pattern.Kunal_Kushwaha;

public class Reverse_Alphabet_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
