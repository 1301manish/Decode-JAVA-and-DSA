package Week_10_Recursion;

public class pip {

    public static void pip(int n){
        if (n==0) return;
        System.out.print("Pre" + n + " "); //Pre
        pip(n-1);
        System.out.print("in" + n + " "); //In
        pip(n-1);
        System.out.print("post" + n + " "); //Post
    }
    public static void main(String[] args) {
        pip(3);
    }
}
