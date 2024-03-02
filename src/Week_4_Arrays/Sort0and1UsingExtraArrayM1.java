package Week_4_Arrays;

public class Sort0and1UsingExtraArrayM1 {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,1,0,0,1,0};
        int n = arr.length;
        //by using extra array
        int [] brr = new int[n];
        int k = 0;
        //for inserting all 0's
        for (int i = 0 ; i<n ; i++){
            if (arr[i]==0) brr[k++] = arr[i];
        }
        // for inserting all 1's
        for (int i = 0 ; i<n ; i++){
            if (arr[i]==1) brr[k++] = arr[i];
        }
        //Display
        System.out.println("Original array : ");
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray after sorting");
        for (int i = 0; i<n; i++){
            System.out.print(brr[i] + " ");
        }
    }
}
