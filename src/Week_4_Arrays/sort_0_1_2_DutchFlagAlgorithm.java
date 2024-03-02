package Week_4_Arrays;
/*
ALGORITHM:

Break array in 4 part in such a way :
                                                              (unsorted part)
            [0 0 0 0 0 . . . . .] [1 1 1 1 1 . . . . . .] [2 1 0 1 0 2 . . . . .] [2 2 2 2 2 . . . . .]
Index:      0               low-1 low               mid-1 mid                high high+1            n-1

*/
public class sort_0_1_2_DutchFlagAlgorithm {
    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,0,2,0,1,1,1,2,2,1,0,1};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
