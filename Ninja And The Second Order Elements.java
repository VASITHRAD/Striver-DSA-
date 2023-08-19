import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
         int[]x=new int[2];
        Arrays.sort(a);
        x[0]=a[n-2];
        x[1]=a[1];
        return x;
    }
}
