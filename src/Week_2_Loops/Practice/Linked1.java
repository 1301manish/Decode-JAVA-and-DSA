package Week_2_Loops.Practice;


import java.util.LinkedList;

public class Linked1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();// link list is created

        //adding elememt
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);

        //adding element at specific position
        list.add(0, 0);
        list.addFirst(0);
        list.addLast(7);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);

        //get an element
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        //changing an element
        list.set(6, 6);
        System.out.println(list);


    }
}