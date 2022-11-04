package Shivam;

import java.util.ArrayList;
import java.util.Scanner;

public class Pod4_2 {
	static String out= new String();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.nextLine());
String input = sc.nextLine();
String[] ip = input.split(",");
int[] ar = new int[ip.length];
ArrayList<Integer> op = new ArrayList<Integer>(ip.length);
int count=0;
boolean outb=false, trailb=false,first=true;
for(int i=0;i<ip.length;i++) {
	if(!(ip[i].equals("-1")))
	{//System.out.println("non -1");
		outb=true;
	out+=ip[i] + ",";	
	}
	else {
		//System.out.println("its -1");
		count++; trailb=true;}
		}
	
	StringBuilder out1 = new StringBuilder(out);
    if(!trailb) { 
    	out1.deleteCharAt(out.length()-1);
    System.out.print(out1);
    }
    if(!outb) {
    	for(int i=0;i<count;i++)
    		if(i<count-1)System.out.print("-1,");
    		else System.out.print("-1");
    }
    if(trailb && outb) {
    	System.out.print(out);
    	for(int i=0;i<count;i++)
    		if(i<count-1)System.out.print("-1,");
    		else System.out.print("-1");
    }
    
}}
