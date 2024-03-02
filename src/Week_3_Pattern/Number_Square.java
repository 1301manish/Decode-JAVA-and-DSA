package Week_3_Pattern;
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5

//1  	2	3	4	5
//6	    7	8	9	10
//11	12	13	14	15
//16	17	18	19	20
public class Number_Square {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= 5; j++) {  //Columns
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        int k=1;
        for (int i = 1; i <=4; i++) {      //Rows
            for (int j = 1; j <=5; j++) {  //Columns
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
        System.out.println();
    }
}