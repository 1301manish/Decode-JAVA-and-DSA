package Week_5_Multidimensional_Array;

public class Merge_Interval {
    public static void main(String[] args) {
        int[][] mat = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int m = mat.length;
        int n = mat[0].length;
        int[][] mat1 = new int[m][n];
        int r = 0;
        int c = 0;
        int start = mat[0][0]; // Initialize start with the first interval's start
        int end = mat[0][1];   // Initialize end with the first interval's end

        // Iterate through each interval
        for (int i = 1; i < m; i++) {
            // If the current interval's start is less than or equal to the previous interval's end,
            // merge the intervals by updating the end
            if (mat[i][0] <= end) {
                end = Math.max(end, mat[i][1]); // Merge intervals
            } else {
                // If the current interval does not overlap with the previous one,
                // store the merged interval and update start and end for the next interval
                mat1[r][c] = start;
                mat1[r][c + 1] = end;
                r++;
                start = mat[i][0];
                end = mat[i][1];
            }
        }
        // Store the last merged interval
        mat1[r][c] = start;
        mat1[r][c + 1] = end;

        // Print the merged intervals
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
