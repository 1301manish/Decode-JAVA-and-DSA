package Week_4_Arrays.ArrayList.ArrayListQuestions;
//Question1 Write a Java program to insert an element into given array list of size n at the first position

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        list.add(0,0);
        System.out.println("Original List: " + list);
    }
}
