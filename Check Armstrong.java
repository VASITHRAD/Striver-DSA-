import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1){
			System.out.print("true");
		}
		else{
		int co=n;
		String a=Integer.toString(n);
		String[]an=a.split("");
		int nlen=an.length;
		int s=0;
		for(int i=0;i<nlen;i++){
			Double x=0.0;
			int c=co%10;
			x=Math.pow(c,nlen);
			s+=x;
			co=co/10;
			
		}
		//System.out.print(s)
		if(s==n){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
		}

	}
}
