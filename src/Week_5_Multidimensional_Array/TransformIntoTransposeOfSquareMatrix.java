package Week_5_Multidimensional_Array;

public class TransformIntoTransposeOfSquareMatrix {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 4
        // 7 8 5
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
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
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        //Transpose Matrix
        System.out.println("Transpose Matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
