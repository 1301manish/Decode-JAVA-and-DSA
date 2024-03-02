package Week_3_Methods;

public class nCr {
    public static int Factorial(int f){
        int fact = 1;
        for (int i = 2; i <=f ; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void combination(int n , int r){
        int NCR = Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println("Combination is : " + NCR);
    }

    public static void permutation(int n , int r){
        int NPR = Factorial(n)/Factorial(n-r);
        System.out.println("Permutation is : " + NPR);
    }
    public static void main(String[] args) {
        combination(7,2);
        permutation(7,2);
        System.out.println("Factorial of zero is : " + Factorial(0));
    }
}
