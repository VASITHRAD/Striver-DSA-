public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        return fun(x,0,new int[x]);
    }
    public static int[] fun(int x,int i,int[] arr){
        if(x==0){
            return arr;
        }
        else{
            arr[i]=x;
            return fun(x-1,i+1,arr);
        }
    }
}
