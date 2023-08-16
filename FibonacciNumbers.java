public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        int[] fibNumbers = new int[n];
        
        if (n >= 1) {
            fibNumbers[0] = 0;
        }
        if (n >= 2) {
            fibNumbers[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }
        
        return fibNumbers;
    }
}
