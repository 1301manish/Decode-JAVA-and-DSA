package Week_6_Strings_And_StringBuilders;

import java.util.Scanner;

public class MostOccurringWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[] strArray = str.split("\\s+");

        // Initialize a variable to store the maximum occurrence count
        int max = 0;

        // Iterate through each character in the word to find the maximum occurrence count
        for (int i = 0; i < strArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) count++;
            }
            if (count > max) max = count;
        }

        // Iterate through each character in the word again to print characters with maximum occurrence count
        System.out.println("Most occurring word : ");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) count++;
            }
            if (count == max) System.out.println(strArray[i] + " : " + max);;
        }
    }
}
