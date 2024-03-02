package Week_2_Loops.Practice;


import java.util.LinkedList;

public class Linked2{
    public static void main(String[] args) {
        LinkedList<String> animal = new LinkedList<>();// link list is created

        //adding elememt
        animal.add("monkey");
        animal.add("cat");
        animal.add("dog");
        System.out.println(animal);

        //adding element at specific position
        animal.add(2, "horse");
        System.out.println(animal);

        //remove element
        animal.remove(1);
        System.out.println(animal);

        //get an element
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }


        //changing an element
        animal.set(2, "camel");
        System.out.println(animal);


    }
}