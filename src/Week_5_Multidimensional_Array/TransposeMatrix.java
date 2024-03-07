package Week_5_Multidimensional_Array;

public class TransposeMatrix {
    public static void main(String[] args) {
        // 1 2
        // 4 5
        // 7 8
        int [][] arr = {{1,2},{4,5},{7,8}};
        int m = arr.length;
        int n = arr[0].length;

        // Original Matrix
        System.out.println("Original Matrix : ");
        for (int i = 0; i < m; i++) { //Rows
            for (int j = 0; j < n; j++) { //Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Transpose Matrix
        System.out.println("Transpose Matrix :");
        for (int j = 0; j < n; j++) { // Columns
            for (int i = 0; i < m; i++) { //Rows
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
