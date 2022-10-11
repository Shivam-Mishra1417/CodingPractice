package Shivam;

import java.util.Scanner;

public class Pod2_2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k= sc.nextInt();
	int capacity = (n*(n+1))/2;
	int count=0;
	boolean flag=false;
	//System.out.println("n :"+n+"  k :"+k);
	//System.out.println("cap :"+capacity);
	//System.out.println("count :"+count);
	if( n!=0 && k!=0) {
	if(k>capacity) flag=false;
	else {
		flag=true;
		while(n < k) {
			//System.out.println("n :"+n+"  k :"+k);
			k = k-n;
			n = n-1;
			count = count + 1;
			//System.out.println("x-count :"+count);
		}
	}
	if(flag ) {
		System.out.println((count+1));	
	}
		else
		System.out.println("-1");
}
else if(n==0 && k!=0){System.out.println("-1");}
else if(n!=0 && k==0 ) {System.out.println("0");}
}
}
