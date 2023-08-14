import java.util.*;
public class Solution {

    public static void main(String[] args) {
        //Your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=2;i<a;i++){
            if (a%i==0){
                s++;
            }
        }
      if(s>0){
          System.out.print("false");
      }
      else{
          System.out.print("true");
      }
    }

}
