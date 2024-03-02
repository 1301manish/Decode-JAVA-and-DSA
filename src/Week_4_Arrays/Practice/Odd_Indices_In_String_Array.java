package Week_4_Arrays.Practice;
/*Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
        strings stored on odd indices of the array.*/
public class Odd_Indices_In_String_Array {
    public static void main(String[] args) {
        String[] arr = {"ab","bc","cd","de","ef","fg","gh"};
        for (int i = 0; i < arr.length ; i++) {
            if(i%2!=0) System.out.println(arr[i]);
        }
    }
}
