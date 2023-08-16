public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int x=n,rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;

        }
         if(n==rev){
            return true;
        }
        return false;
    }
}
