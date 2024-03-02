package Week_4_Arrays;
//One pass solution
public class Sort0and1WithoutExtraArrayM2 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1,0,1,0};
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if (arr[i]!=0 && arr[j]!=1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                //arr[i] = 0; (Instead of using extra temp variable we can directly replace the value)
                //arr[j] = 1;
                //i++;
                //j--;
            }
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
        }
        //Display
        System.out.println("Array after sorting");
        for (int m = 0; m<arr.length; m++){
            System.out.print(arr[m] + " ");
        }
    }
}
