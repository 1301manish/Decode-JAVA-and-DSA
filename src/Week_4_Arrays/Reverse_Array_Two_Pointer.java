package Week_4_Arrays;

public class Reverse_Array_Two_Pointer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k =0;
        int m =arr.length-1;
        while(k<=m){
            int temp = arr[k];
            arr[k] = arr[m];
            arr[m] = temp;
            k++;
            m--;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        //using for loop
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        //for (int i = 1; i <=5 ; i++)     --> Reversing the part of the array
        for (int i = 0; i <(arr1.length)/2 ; i++) {
            //i+j=n-1;
            int j = arr1.length -1 -i;
            int temp1 = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp1;
        }
        for (int element : arr1) {
            System.out.print(element + " ");
        }
    }
}
