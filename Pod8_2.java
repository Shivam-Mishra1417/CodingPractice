package pod8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pod8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		String inp = sc.nextLine();
		String[] ip = inp.split(",");
		ArrayList<Integer> og = new ArrayList<Integer>();
		ArrayList<Integer> copy = new ArrayList<Integer>();
		for(int i=0;i<ip.length;i++) {
			og.add(Integer.parseInt(ip[i]));
			copy.add(Integer.parseInt(ip[i]));	
		}
		
		Collections.sort(og,Collections.reverseOrder());
		//System.out.println(og);
		//System.out.println(copy);
		//System.out.println(og.indexOf(k-1));
		
		//System.out.println("Answer :");
		System.out.println(copy.indexOf((og.get(k-1))));
	
	}

}
