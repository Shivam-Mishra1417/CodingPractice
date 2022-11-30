package Shivam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Pod11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			
			String from = ss[0];
			String to = ss[1];
			
			map.put(from, to);
		}
		
		//System.out.println(map);
		Set<String> origins = map.keySet();
		//System.out.println(origins);
		
		Iterator<String> it = origins.iterator();
		int count = 0;
		String result = "";
		while(it.hasNext()){
			String start = it.next();
			int ct = 0;
			String res = "";
			res = start;
			while(map.get(start) !=null){
				res += " " + map.get(start);
				start = map.get(start);
				ct++;
			}
			
			if(ct>count) {
				count = ct;
				result = res; 
			}
			
		}
		System.out.println(result);
	}
}
