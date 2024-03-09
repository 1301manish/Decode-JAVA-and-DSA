package Week_5_Multidimensional_Array;

/*
Advantages of ArrayList over arrays :

1. Variable size
2. The arraylist inside the arraylist can be of different sizes
     a = {10,20,30}
     b = {40,50}
     c = {60,70,80,90,100}

     arr = {a,b,c}
 */


import java.util.ArrayList;
import java.util.List;

public class _2DArrayList {
    public static void main(String[] args) {
        //1D ArrayList
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);

        //2D ArrayList
        List<List<Integer>> arr = new ArrayList<>();
        //Adding Elements in 2D ArrayList
        arr.add(a);arr.add(b);arr.add(c);arr.add(d);

        // Printing the 2D Arraylist

        //Printing 1D ArrayList "a"
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

        //Printing 2D ArrayList "arr"
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Printing the particular element of 2D ArrayList
        System.out.println(arr.get(1).get(1));

        //Printing the entire 2D ArrayList manually
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> x = arr.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }

        //Printing 2D ArrayList without using extra 1D ArrayList
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

        //Method 3 to print entire 2D ArrayList
        System.out.println(arr);

        //Extra functions

//        arr.clear();
//        arr.remove(1);
//        arr.isEmpty();
//        arr.contains(a);
//        arr.indexOf(a);
//        arr.toArray();

    }
}
