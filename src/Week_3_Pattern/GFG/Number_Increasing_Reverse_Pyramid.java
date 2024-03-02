package Week_3_Pattern.GFG;

public class Number_Increasing_Reverse_Pyramid {
    public static void main(String[] args) {
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
