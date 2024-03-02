package Week_4_Arrays.Practice;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int max =0;
        int i=0;
        int j=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                max= Math.max(max,count);
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        System.out.println("Maximum platform needed : " + max);
    }
}
