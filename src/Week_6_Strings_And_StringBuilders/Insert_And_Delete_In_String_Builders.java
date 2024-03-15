package Week_6_Strings_And_StringBuilders;

public class Insert_And_Delete_In_String_Builders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");
        s.insert(3,3);  //insert integer
        System.out.println(s);

        s.insert(3,'m');   //insert character
        System.out.println(s);

        s.insert(4,"pqr");   //insert string
        System.out.println(s);

        s.insert(1,true);   //insert boolean
        System.out.println(s);

        //Delete a particular character
        s.deleteCharAt(3);
        System.out.println(s);

        //Delete in particular range
        s.delete(3,5);
        System.out.println(s);
    }
}
