public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double n=0.0;
        switch(ch){
            case 1:{ 
                n=Math.PI*a[0]*a[0];
                break;
                         }
            case 2:{
                n=a[0]*a[1];
                break;
            }
        }
        return n;
    }
}
