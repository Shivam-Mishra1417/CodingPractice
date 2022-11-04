package Shivam;

import java.util.Arrays;
import java.util.Scanner;

public class Pod4_1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String pp = sc.nextLine();
    String ps = sc.nextLine();
    StringBuilder input_pp = new StringBuilder(pp);
    StringBuilder input_ps = new StringBuilder(ps);
    input_pp.deleteCharAt(0);
    input_pp.deleteCharAt(input_pp.length() - 1);
    input_ps.deleteCharAt(0);
    input_ps.deleteCharAt(input_ps.length() - 1);
   // System.out.println("ps>" + ps);
    //System.out.println("pp>" + input_pp);

    String[] pp1 = input_pp.toString().split(",");
    String[] ps1 = input_ps.toString().split(",");

    int[] pp2 = new int[pp1.length];
    int[] ps2 = new int[ps1.length];
   int[] dd = new int[ps1.length];
    for (int i = 0; i < pp1.length; i++) {
      pp2[i] = Integer.parseInt(pp1[i]);
      ps2[i] = Integer.parseInt(ps1[i]);
    }

    
    System.out.println(Arrays.toString(pp2));
    System.out.println(Arrays.toString(ps2));
    
    String op="(";
    double delivery_day=0;
    for(int i=0;i<pp2.length;i++){
    	delivery_day = Math.ceil((double)(100 - pp2[i])/(double)ps2[i]);
    	dd[i] = (int)delivery_day;
    }
    System.out.println(Arrays.toString(dd));
    
    int cm = dd[0],ct=1;
    for(int i=1;i<dd.length;i++) {
    	
    	//System.out.print("--"+dd[i]+" cm "+cm);
    	if(dd[i] > cm) {
    		System.out.print("("+cm+","+ct+"),");
    		cm = dd[i];
    		ct=0;
    	}
    	ct++;
    }
    System.out.print("("+cm+","+ct+")");
  }

}