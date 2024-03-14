package Week_6_Strings_And_StringBuilders;
/*
We cannot change an individual character in a string, we can, but we will waste a lot of time and space
 */
public class ModifyCharacterInString {
    public static void main(String[] args) {
        String s = "hello";
        //changing second index
        //changing l to y
        s = s.substring(0,2) + 'y' + s.substring(3); //it takes a lot of space and time. It is not efficient
        System.out.println(s);
        /*
        Explanation :
        S is pointing to "hello"
        string "hello" is already there in the string
        After this all these strings are created resulted in taking a lot of space and time
        step1 : "he"
        step2 : "y"
        step3 : "hey"
        step4 : "lo"
        step5 : "heylo"
        Now S is pointing to "heylo"   not to "hello"
        Hello still resides in the memory until it is garbage collected.
        In Java, immutability is enforced for security, thread-safety, and optimization purposes.
         */

    }
}
