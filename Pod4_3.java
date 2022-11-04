package Shivam;

import java.util.Scanner;
import java.util.Stack;

public class Pod4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Stack st = new Stack();
		boolean ans=true;
		String[] ip = input.split("");
		st.push(ip[0]);
		if(ip[0].equals(")") | ip[0].equals("]") | ip[0].equals("}"))
		{
			ans=false;
		}
		else
		for(int i=1;i<ip.length;i++) {
			if(ip[i].equals(")") | ip[i].equals("]") | ip[i].equals("}"))
			{
				//System.out.println(st.peek());
				//System.out.println("matching with "+ip[i]);
				String top = (String) st.peek();
				if((ip[i].equals(")") && top.equals("(")) |
						(ip[i].equals("]") && top.equals("[")) | (ip[i].equals("}") && top.equals("{"))) st.pop();
				else {ans=false; break;}
				
			}
			else st.push(ip[i]);
//			if(ip[i].equals(")") | ip[i].equals("]") | ip[i].equals("}"))
//			if(!((ip[i].equals(")") && ip[i-1].equals("("))  | (ip[i].equals("]") && ip[i-1].equals("[")) | (ip[i].equals("}")&& ip[i-1].equals("{"))))
//			{ 
//				//System.out.println("here -> "+ip[i-1]+" "+ip[i]);
//				ans=false; break;}
				
				
			
		}
		
		if(ans && st.empty()) System.out.println("true");
		else System.out.println("false");
	}

}
