package Week_4_Arrays;
//In this pass by value takes place
//Pass by reference takes place in case of array only
public class Pass_By_Value {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }

    public static void change(int a) {
        a = 90;
    }
}
