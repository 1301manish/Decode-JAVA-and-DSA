package Week_3_Pattern.Assignment;
/*
1
A B
1 2 3
A B C D
 */
public class Question4 {
        public static void main(String[] args) {
            for (int i = 1; i <= 4; i++) {      //Rows
                int k = 65;
                for (int j = 1; j <= i; j++) {  //Columns
                    if(i%2!=0){
                        System.out.print(j+" ");
                }
                    if(i%2==0){
                        System.out.print((char)k+" ");
                        k++;
                    }
            }
                System.out.println();
        }

    }

}
