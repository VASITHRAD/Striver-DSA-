public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        return func(0,x,new int[x]);
    }
    public static int[]func(int i,int x,int[]arr){
        if(x==i){
            return arr;
        }
        else{
            arr[i]=i+1;
            return func(i+1,x,arr);
        }
    }
}
