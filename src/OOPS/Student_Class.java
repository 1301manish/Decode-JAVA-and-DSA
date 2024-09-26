package OOPS;

/*
Array v/s Class

Array -> Used to store similar data type & we use it when there are same type of multiple data
Class -> We use class when we have multiple attributes & we need to create same type of object


Important Points :
    1. We have to declare the class outside the main function.
    2. Classes are pass by reference.


    * If you declare the class outside the main class then it can be used in any file in that particular package.
    * If you want to use the same class in some other package then you need to import that class from that particular package.

    Access Modifiers
        * Public -> Can be used in any package
        * Private -> Can be used in the same class
        * Default -> Can be used in the same package
 */

public class Student_Class {

    public static class Student { //User defined data type
        String name;
        int rollNo;
        double percent;
    }

    public static void change (Student s) {
        s.name = "Mohan";
    }

    public static void main(String[] args) {
        Student x = new Student(); // Creation of the object (Declaration)
        // Initializing the object
        x.name = "Raghav";
        x.rollNo = 21;
        x.percent = 91.4;

        System.out.println(x.name);
        System.out.println(x.rollNo);
        System.out.println(x.percent);

        // Updation
        x.name = "Rahul";
        System.out.println(x.name);

        change(x); // Because classes are pass by reference
        System.out.println(x.name); // Output: Mohan (Because classes are pass by reference)
    }
}
