package Week_4_Arrays;
//Two pass solution
public class SortZeroandOneM3 {
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,1,0};
        int n = arr.length;
        int countOne = 0;

        for (int i = 0; i <n ; i++) {
            if (arr[i]==1) countOne++;
        }
        int countZero = n - countOne;
        int k = 0;
        for (int i = 1; i <= countZero ; i++) {
            arr[k++] = 0;
        }
        for (int i = 1; i <= countOne ; i++) {
            arr[k++] = 1;
        }
        System.out.println("Array after sorting");
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
