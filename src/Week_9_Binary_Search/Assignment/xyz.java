package Week_9_Binary_Search.Assignment;

public class xyz {
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,3,1,1,1,1};
        int k = 6;
        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;
        int max = 0;
        while (i<n-1){
            if (j==n && sum<k) {
                i++;
                j=i;
                sum=0;
            }

            if (sum<k) {
                sum += arr[j];
                j++;
            } else if (sum==k) {
                max = Math.max(max,j-i);
                i++;
                j=i;
                sum=0;
            }
            else {
                i++;
                j=i;
                sum=0;
            }
        }
        System.out.println(max);
    }
}
