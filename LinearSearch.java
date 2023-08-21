import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        int s=-1;
        for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    s=i;
                    break;
                }   
            
        }
        return s;
    }
}
