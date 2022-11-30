package pod8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Pod8_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String[] ip = inp.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		ArrayList<String> as = new ArrayList<String>();
		ArrayList<String> unique = new ArrayList<String>();
		for(int i=0;i<ip.length;i++) {
			as.add(ip[i]);
			if(!unique.contains(ip[i]))
				unique.add(ip[i]);
			if(map.containsKey(ip[i]))
				map.put(ip[i], map.get(ip[i]) + 1);
			else
				map.put(ip[i], 1);	
		}
		//System.out.println(map+" "+map.size());
		//System.out.println(unique);
		int sub = map.size();
		int tot = map.size();
		boolean flag=false;
		int start = 0;
		while(!flag) {
			
			//System.out.println("Start : "+start+ "  sub : "+sub);
			HashSet<String> check = new HashSet<String>();
			for(int i=start;i<start+sub;i++) {
				check.add(ip[i]);
			}
			if(check.size()<tot) {
				start++;
			}
			else {
				//System.out.println("else");
				System.out.println((start+1)+" "+(start+sub));
				flag=true;
				break;
			}
			//System.out.println(">>"+check);
			//System.out.println(">>start :"+start+"  sub : "+sub);
			if(start == ip.length - sub + 1) {
				start=0;
				sub++;
			}
			if(sub == ip.length) {
				flag=true;
			//System.out.println("last");
			System.out.println("1 "+ip.length);
			break;
			}
			
		}
		
	}

}
