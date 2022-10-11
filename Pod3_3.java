package Shivam;

import java.util.Scanner;

public class Pod3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
        int n1=2;
        int n2=3;
        int x=n;
        x=x-3;
        int temp=0;
        while(x>0 && n>3) {
        	temp=n1+n2;
        	n1=n2;
        	n2=temp;
        	x--;
        	
        }
        if(n==2)System.out.println("2");
        else if(n==3)System.out.println("3");
        else System.out.println(n2);
	}

}
