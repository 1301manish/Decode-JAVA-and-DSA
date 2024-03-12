package Week_6_Strings;

public class PlusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "xyz";
        System.out.println(s+t);
        System.out.println(s+"def");   //we can add at the end
        System.out.println("def"+s);   //we can add at the starting

        System.out.println(s+10);   //here , abc10 is a string   adding 10 at the end
        System.out.println(10+s);   //here , 10abc is a string   adding 10 at the starting

        System.out.println(s+'d');

        System.out.println("abc" + 10 + 20);  // Output -->> abc1020
        //abc + 10 = abc10 -> string + integer = string , abc10 + 20 = abc1020 -> string + integer = string

        System.out.println(10 + 20 + "abc");  // Output -->> 30abc
        //10 + 20 = 30 -> integer + integer = integer , 30+abc = 30abc -> integer + string = string

        String a = "abc";
        a = a + "pqr";
        System.out.println(a);


    }
}
