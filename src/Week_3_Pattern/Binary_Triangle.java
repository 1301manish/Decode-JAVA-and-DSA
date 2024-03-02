package Week_3_Pattern;

public class Binary_Triangle {
    public static void main(String[] args) {
        //Method 1
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();

        }
        //Method 2
        for (int i = 1; i <= 4; i++) {      //Rows
            for (int j = 1; j <= i; j++) {  //Columns
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print(1+" ");
                    }
                    else System.out.print(0+" ");
                }
                if(i%2==0){
                    if(j%2!=0){
                        System.out.print(0+" ");
                    }
                    else System.out.print(1+" ");
                }


            }
            System.out.println();
        }
    }
}