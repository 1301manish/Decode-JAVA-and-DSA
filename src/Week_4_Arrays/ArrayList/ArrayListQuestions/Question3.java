package Week_4_Arrays.ArrayList.ArrayListQuestions;

import java.util.ArrayList;

//Question3 Write a Java program to swap two elements in an array list of size n.
public class Question3 {

    public static void Reverse(ArrayList<Integer> list){
        int i =0;
        int j=list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Orignal ArrayList : "+list);
        Reverse(list);
        System.out.println("Revere ArrayList : "+list);
    }
}
