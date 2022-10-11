package Shivam;

import java.util.Scanner;

public class Pod3_2 {
public static void main(String[] args) {
	//input
	Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
  sc.nextLine();
  String input = sc.nextLine();
  String[] ip = input.split(",");
  int[] a = new int[ip.length];
  
  for(int i=0;i<ip.length;i++) {
	  a[i] = Integer.parseInt(ip[i]);
  }
  
  //logic
  int max_peak=-1,index=-1,t_p=-1;
  boolean peaked=false;
  for(int i=1;i<a.length-1;i++) {
	  if(a[i] > a[i-1] && a[i] > a[i+1]) {
		  int t1= a[i] - a[i-1];
		  int t2 = a[i] - a[i+1];
		  
		  if(t1>t2) t_p=t1;
		  else t_p=t2;
		  
		  //System.out.println(t_p);
		  if(max_peak < t_p) {
		  max_peak = t_p;
		  index = i;
		  peaked=true;
		  }
	  }
	  
	 
	  
  }
  //output
  if(peaked) System.out.println(index);
  else System.out.println("-1");
}
}
