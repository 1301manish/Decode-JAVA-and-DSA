package Week_6_Strings_And_StringBuilders;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaaaabbfffgggdkkkdmmmmpppppsss";
        char [] arr = s.toCharArray();
        int n = arr.length;
        String ans = "";
        int i = 0;
        int j = 0;
        while (j<n){
            if (arr[i]==arr[j]) j++;
            else {
                ans += arr[i];
                int len = j-i;
                if (len>1) ans += len;
                i=j;
            }
        }
        ans += arr[i];
        int len = j-i;
        ans += len;

        int size = ans.length();
        System.out.println(ans);
        System.out.println(size);
    }
}
