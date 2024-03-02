package Week_4_Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr = {3,4,5,9};
        int [] brr = {5,6,8,13};
        int a = arr.length;
        int b = brr.length;
        int length = a+b;
        int [] crr = new int [length];
        int m = 0;
        int n = 0;
        int k = 0;
        while (m<a && n<b) {
            if(arr[m]<brr[n]){ 
                crr[k++] = arr[m];
                m++;
            }
            else {
                crr[k++] = brr[n];
                n++;
            }
        }
        while(m<a){
            crr[k++] = arr[m++];
        }
        while(n<b){
            crr[k++] = brr[n++];
        }
        //Display
        for (int i = 0; i < length ; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}
