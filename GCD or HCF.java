public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int r=n%m;

           while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
        
    }
    
}
