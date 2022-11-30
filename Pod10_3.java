package pod10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Pod10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] ip = s.split(" ");
		//Arrays.sort(ip);
		//System.out.println(Arrays.toString(ip));
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<ip.length;i++) {
			if(map.containsKey(ip[i])) {
				map.put(ip[i], map.get(ip[i])+1);
			}
			else
				map.put(ip[i], 1);
		}
		String op="";
			Iterator<String> val = map.keySet().iterator();
			while(val.hasNext()) {
				String ss = (String)val.next();
				int c = map.get(ss);
				int max=-1;
				
;				if(c >= ip.length/2) {
					//System.out.println(ss);
					if(c>max) {
						op=ss;
						max=c;
					}
					//break;
				}
			}
			
		System.out.println(op);	
	}

}
