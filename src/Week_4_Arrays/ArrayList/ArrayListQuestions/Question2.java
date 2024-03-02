package Week_4_Arrays.ArrayList.ArrayListQuestions;

import java.util.ArrayList;

//Question2 Write a Java program to remove the third element from given arraylist of size n.
public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        list.remove(2);
        System.out.println("Original List: " + list);

    }
}
