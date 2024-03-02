package Week_3_Pattern;
//  *
//  *
//*****
//  *
//  *
//Here n should be odd to find the middle row and column
public class Star_Plus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {      //Rows
            for (int j = 1; j <= 5; j++) {  //Columns
                if(i==(5/2+1) || j==(5/2+1) ){
                    System.out.print("* ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
