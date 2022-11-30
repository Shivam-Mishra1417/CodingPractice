package pod9;

import java.util.Arrays;
import java.util.Scanner;

public class Pod9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ip = input.split(" ");
		int[] ar = new int[ip.length];
		int[] ls = new int[ip.length+1];
		int total_sum=0;
		ls[0]=0;
		for(int i=0;i<ip.length;i++) {
			ar[i] = Integer.parseInt(ip[i]);
			total_sum+=ar[i];
		    ls[i+1] = total_sum;	
		}
		//System.out.println(Arrays.toString(ar));
		//System.out.println(Arrays.toString(ls));
		int count =0,max=-1;
		int ws=2;
		boolean found=false;
		while(ws<=ar.length) {
			//System.out.println("window size :"+ws);
			for(int i=0;i<=ar.length-ws;i++) {
				count++;
				//System.out.println("");
//				for(int j=i;j<i+ws;j++) {
//					System.out.print(ar[j]);
//				}
			//	System.out.println("     "+i+" - "+(i+ws-1)+ "  total: "+(ls[i+ws]-ls[i]));
				int l=0,r=0;
				for(int j=i;j<i+ws;j++) {
					//System.out.print(" "+ls[j+1]);
					//System.out.print(" : left : "+(ls[j+1]-ls[i]));
					//System.out.print(" : right :"+(ls[i+ws]-ls[j+1]));
					l = ls[j+1]-ls[i];
					r = ls[i+ws]-ls[j+1];
					if(l==r) {
						found=true;
						if(l>max)
							max=l;
					}
				}
			}
			ws++;
		}
		//System.out.println("\nTotal is "+count);
		if(found)
			System.out.println(max);
		else
			System.out.println("0");
	}

}
