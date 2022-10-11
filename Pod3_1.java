package Shivam;

import java.util.Scanner;

public class Pod3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String pattern = sc.nextLine();
		input = input.replace('[', ' ');
		input = input.replace(']', ' ');
		//System.out.println(input);
		String[] ip=input.split(" ");
		//System.out.println(ip.length);
        //System.out.println("x"+ip[0]+"-"+ip[5]);
		
        pattern = pattern.replace('[',' ');
        pattern = pattern.replace(']', ' ');
        //System.out.println(pattern);
        String[] pt = pattern.split(" ");
        //System.out.println(pt.length);
        //System.out.println("x"+pt[0]+"-"+pt[2]);
        int count=0,fc=1;	
        boolean matched=false;
        //logic
        for(int i=1;i<pt.length;i++) {
        	//System.out.println("Starting match for "+pt[i]);
        	count=0;
        	for(int j=1;j<ip.length;j++) {
        		
        		String match = pt[i].replace('*', '.');
        		if(ip[j].matches(match)) { 
        			//System.out.println("Matched with -"+ip[j]);
        			count++;
        		matched = true;	
        		}
        	}
        	if(count!=0)
        	fc=fc*count;
        	//System.out.println("Match for "+pt[i]+" is "+count);        
        }
        //System.out.println("Final answer - "+fc);
        if(matched)
        System.out.println(fc);
        else 
        System.out.println("0");
        
	}

}
