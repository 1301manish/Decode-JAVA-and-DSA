package Week_2_Conditional;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price of the item : ");
        double cp = sc.nextDouble();
        System.out.print("Enter the selling price of the item : ");
        double sp = sc.nextDouble();
        if(cp == sp){
            System.out.println("No profit no loss!!!!!");
        }
        else if(cp>sp){
            System.out.println("There is a loss of rupees "+(cp-sp));
        }
        else{
            System.out.println("There is a profit of rupees"+(sp-cp));
        }
    }
}
