package Week_4_Arrays;

//In array pass by reference takes place
public class Pass_By_Reference {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }
}
