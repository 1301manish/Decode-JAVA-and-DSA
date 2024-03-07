package Week_5_Multidimensional_Array;

public class RowAndColumnWisePrinting {
    public static void main(String[] args) {

        // 1 2
        // 4 5
        // 7 8
        int [][] arr = {{1,2},{4,5},{7,8}};
        int m = arr.length;
        int n = arr[0].length;

        //Row wise printing
        System.out.println("Row wise printing : ");
        for (int i = 0; i < m; i++) { //Rows
            for (int j = 0; j < n; j++) { //Columns
                System.out.print(arr[i][j] + " ");
            }
        }

        //column wise printing
        System.out.println("\ncolumn wise printing :");
        for (int j = 0; j < n; j++) { // Columns
            for (int i = 0; i < m; i++) { //Rows
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
