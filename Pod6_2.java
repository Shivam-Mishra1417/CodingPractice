package Shivam;

import java.util.*;

public class Pod6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); 
		String l1 = sc.nextLine();
		String l2=sc.nextLine();
		
		String[] l1n = l1.split(",");
		String[] l2n = l2.split(",");
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		boolean isone=true;
		
		for(int i=0;i<l1n.length;i++) {
			int a=Integer.parseInt(l1n[i]);
			int b=Integer.parseInt(l2n[i]);
			
			if(map.containsKey(a)) {
				ArrayList<Integer> temp = map.get(a);
				if(!(temp.contains(b))) {
				temp.add(b);
				map.put(a, temp);
				}
				
			}
			else
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(b);
				map.put(a, temp);
			}
			if(map.containsKey(b)) {
				ArrayList<Integer> temp = map.get(b);
				if(!(temp.contains(a))) {
				temp.add(a);
				map.put(b, temp);
				}
				
			}
			else
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(a);
				map.put(b, temp);
			}
			
		}
		//System.out.println(map);
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> temp = map.get(i);
			if(temp!=null)
				if(temp.size()>1) {
					isone=false;
					break;
				}
			
		}
		
		int count=0;
		boolean flag=false;
		while(!flag && map.size()>0 && !isone) {
			count++;
			flag=true;
	for(int i=0;i<n;i++) {
		ArrayList<Integer> temp = map.get(i);
		if(temp!=null)
			if(temp.size()==1) {
				flag=false;
				int x = temp.get(0);
				ArrayList<Integer> tt = map.get(x);
				//System.out.println("going to delete "+i);
				if(tt !=null) {
				tt.remove(Integer.valueOf(i));
//				if(tt.size()<2) {map.remove(x);}
//				else
				map.put(x, tt);
				}
			map.remove(i);
			
			}
		
	}
		}
	//System.out.println(map);
	if(!isone)
	System.out.println(count);
	else
		System.out.println("1");
	}
		
	}


