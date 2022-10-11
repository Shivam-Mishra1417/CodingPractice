package Shivam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pod2_1 {
	public static void main(String[] args) {
		//input
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		String[] ip = input.split(",");
		//logic
		int count=0;
		int sub=1;
		boolean matched=false;
		for(int i=0;i<ip.length;i++) {
			sub=1;
			//System.out.println("String :"+ip[i]);
			matched = false;
			while((!matched && ip[i].length() >=sub)) {
				
				String t=ip[i].substring(0,sub);
				//System.out.println("t :"+t);
				boolean looped=true;
				for(int j=0;j<ip.length;j++) {
					
					//System.out.println("x : "+ip[j].substring(0, sub));
					//System.out.println("i "+i+"  j "+j+"  sub "+sub);

					
					
					if(i!=j && ip[j].length()>=sub &&  t.equals(ip[j].substring(0, sub))) {
						looped = false;
						//System.out.println("false");
						if(j==ip.length-1 && ip[i].length()==sub) { 
							//System.out.println("trying true");
							looped=true;}
						break;
					}
					
					
				}
				if(looped) {count+=sub;matched=true;
				//System.out.println("count : "+count);
				}
				else sub++;
			}
			
		}
		System.out.println(count);	
		
		
		
	}

}
