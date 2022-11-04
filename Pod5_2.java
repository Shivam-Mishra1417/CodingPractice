package Shivam;

import java.util.Arrays;
import java.util.Scanner;

public class Pod5_2 {
  static int[] ar;
  static int n;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.nextLine());
    int index = 0, reachable = 0, jump = 0;
    String input = sc.nextLine();
    String[] ip = input.split(" ");
    ar = new int[ip.length];
    for (int i = 0; i < ip.length; i++)
      ar[i] = Integer.parseInt(ip[i]);
       

    //System.out.println(Arrays.toString(ar));
    boolean done = false;
    int at = 0, ct = 0;

    if(ar.length != 1) 
    while(at < n-1) {
      int move_to = 0;
      Value vv = max(at, at + ar[at]);
      System.out.println("at : " + at);
      System.out.println("max value is "+vv.val);
      System.out.println("max values index is "+vv.index);
      //////////////////////
      
      if (vv.val <= 0) 
      {
    	  at = at + Math.max(at,ar[at]); 
      //System.out.println("max is 0 or less");
      }
      else
      { 
    	  at = vv.index;
      }
      
      if(at < (n-1)) {
      if(ar[at] > (n-at)) at = ar[at];
      }
      ct++;
      if(ct>n) 
      {
    	  //System.out.println("breaking bad!!");
      break;
      }
    }
    //System.out.println("");
    //System.out.println("ct ->" + ct);
    System.out.println(ct);
  }

  public static Value max(int from, int to) {
    Value v = new Value();
    System.out.println("from "+from+"  - to "+to);
    int max = -1;
    for (int i = from+1; i <= to && i < n; i++) {

      if (ar[i] + i  >= max) {
    	  max =ar[i] + i;
        v.val = ar[i];
        v.index = i;
      }
    }
    return v;
  }

}

class Value {

  int index;
  int val;
}