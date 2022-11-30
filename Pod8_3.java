package pod8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Pod8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> nums= new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
			nums.add(sc.nextInt());
		
		Queue<Element> q= new LinkedList<Element>();
		Element e = new Element(nums,x);
		
		q.add(e);
		boolean flag=false;
		while(!q.isEmpty()) {
			//System.out.println("Queue >>"+q);
			Element e1 = q.remove();
			//System.out.println("Processing >>"+e1);
			if(e1.target == 0)
			{
				//System.out.println("Answer found");
				System.out.println(e.num.size() - e1.num.size());
				flag=true;
				break;
			}
			
			if(e1.target - e1.num.get(0) >=0) {
				ArrayList<Integer> temp = new ArrayList<Integer>(e1.num);
				temp.remove(0);
				Element tt = new Element(temp,e1.target-e1.num.get(0));
				q.add(tt);
			}
			
			if(e1.target - e1.num.get(e1.num.size()-1) >=0) {
				ArrayList<Integer> temp = new ArrayList<Integer>(e1.num);
				temp.remove(e1.num.size()-1);
				Element tt = new Element(temp,e1.target-e1.num.get(e1.num.size()-1));
				q.add(tt);
			}
		}
		
		if(!flag) System.out.println("-1");
	}

}

class Element{
	ArrayList<Integer> num;
	int target;
	
	public Element(ArrayList<Integer> n,int t) {
		this.num = n;
		this.target = t;		
	}
	
	public String toString() {
		return num+"-"+target;
	}
}