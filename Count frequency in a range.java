public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] res=new int[n];
        int i=1;
        while(i<=n){
            int s=0;
         for(int j=0;j<n;j++){
            if(i==nums[j]){
                s+=1;
            }
            }
            res[i-1]=s;
            i=i+1;  
        }
        return res;
    }
}
