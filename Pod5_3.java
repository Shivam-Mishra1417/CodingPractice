package Shivam;

import java.util.Scanner;

public class Pod5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		String[] ip = input.split(",");
		int[] ar = new int[ip.length];
		for(int i=0;i<ip.length;i++) {
			ar[i] = Integer.parseInt(ip[i]);
		}
		int diff=0;
		for(int i=0;i<ip.length;i++) {
			for(int j=i+1;j<ip.length;j++) {
				if(ar[j] - ar[i] > diff) {
					//System.out.println(ar[j]+" - "+ar[i]);
					diff = ar[j]-ar[i];
				}
				
			}
		}
		//System.out.println("diff "+diff);
		System.out.println(diff);
	}

}
