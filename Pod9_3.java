package pod9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Pod9_3 {
	static int max=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = Integer.parseInt(sc.nextLine());
		
		check(s,k);
		System.out.println(max);
		
	}

	private static int check(String s, int k) {
		
		//System.out.println("String >> "+s);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<s.length();i++) {
			String c = s.substring(i,i+1);
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		Iterator<String> it = map.keySet().iterator();
		boolean done=false;
		while(it.hasNext()) {
			if(map.get(it.next()) < k)
			{
				done=true;
				break;
			}
		}
		//System.out.println(map);
		if(!done) {
			//System.out.println(+s.length());
			if(s.length()>max)
				max=s.length();
			return 1;
		}
		else {
			//System.out.println(s.substring(0,s.length()-1)+" -- "+s.substring(1,s.length()-1));
			int x = check(s.substring(0,s.length()-1),k);
			if(x!=1)
			check(s.substring(1,s.length()),k);
			
			return 0;
			
		}
		
		
	}
}
