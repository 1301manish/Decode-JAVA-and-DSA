package Week_3_Pattern;

public class Number_Alphabet_Triangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}