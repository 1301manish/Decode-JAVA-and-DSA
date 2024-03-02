package Week_4_Arrays.ArrayList.ArrayListQuestions;

import java.util.ArrayList;

//Question5 Given an array of integers, print an arraylist containing only all positive integers present in
// the array.If no positive integers found, print “NA”.
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {32,43,54,45,-43,-98,5,90,87};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>0){
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) System.out.println("NA");
        else System.out.println(list);
    }
}
