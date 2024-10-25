package Week_10_Recursion.Practice_Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class Elimination_Game {
    public static int eliminationGame(ArrayList<Integer> arr){
        if (arr.size() == 1) return arr.get(0);

        for (int i = 0; i < arr.size(); i+=2) {
            System.out.print(arr.get(i) + " ");
            arr.remove(i);
        }

        System.out.println();

        for (int i = arr.size()-1; i >= 0; i-=2) {
            System.out.print(arr.get(i) + " ");
            arr.remove(i);
        }

        return eliminationGame(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int ans = eliminationGame(arr);
        System.out.println("Answer : " + ans);
    }
}
