package Week_4_Arrays;
//Next greatest element
public class NextGreatestElement {
    public static void main(String[] args) {
        int [] arr = {12,8,41,39,2,49,16,28,21};
        int [] ans = new int[arr.length];
        //Method 1 Basic approach
//        int k = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i+1; j < arr.length ; j++) {
//                if (arr[j]>max){
//                    max = arr[j];
//                }
//            }
//            if (max!=Integer.MIN_VALUE) ans[k++]=max;
//            else ans[k++]=-1;
//        }

        //Method 2 Good Approach
        ans[arr.length-1] = -1;
        int nge = arr[arr.length-1];
        for (int i = arr.length-2 ;i >=0 ; i--) {
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
