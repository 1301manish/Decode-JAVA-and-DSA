package Week_4_Arrays.ArrayList.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Collections;

//Question4 Given an input of some integers, sort the integers.
public class Question4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Orignal ArrayList : "+list);
        Collections.sort(list);
        System.out.println("Ascending ArrayList : "+list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Descending  ArrayList : "+list);
    }

}
