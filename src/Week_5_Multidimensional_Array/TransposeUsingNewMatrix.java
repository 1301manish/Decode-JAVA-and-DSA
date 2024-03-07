package Week_5_Multidimensional_Array;

public class TransposeUsingNewMatrix {
    public static void main(String[] args) {
        // 1 2
        // 4 5
        // 7 8
        int [][] arr = {{1,2},{4,5},{7,8}};
        int m = arr.length;
        int n = arr[0].length;

        int [][] transpose = new int[n][m];

        // Original Matrix
        System.out.println("Original Matrix : ");
        for (int i = 0; i < m; i++) { //Rows
            for (int j = 0; j < n; j++) { //Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Filing the elements of the original array in the new array
        for (int i = 0; i < n; i++) { // Columns
            for (int j = 0; j < m; j++) { //Rows
                transpose[i][j] = arr[j][i];
            }
        }

        //Transpose Matrix
        System.out.println("Transpose Matrix :");
        for (int i = 0; i < n; i++) { // Columns
            for (int j = 0; j < m; j++) { //Rows
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
