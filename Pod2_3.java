package Shivam;

import java.util.Scanner;

public class Pod2_3 {
  static String temp,tmp2;
  static boolean found = false, t1 = false;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String m = sc.nextLine();
    String n = sc.nextLine();

    if (m.length() < n.length()) {
      found = false;
    }

    int current_window = n.length();

    while (!found && m.length() >= current_window) {
      for (int i = 0; i <= m.length() - current_window; i++) {
        temp = m.substring(i, i + current_window);
        tmp2 = m.substring(i, i + current_window);
       // System.out.println("i: "+i+" cw: "+current_window+"  :"+temp);
        t1 = true;
        for (int j = 0; j < n.length(); j++) {
          char check = n.charAt(j);
          //System.out.println(" check : "+ check+" - tmp : "+temp+" - tmp2 : "+tmp2);
          if (!temp.contains(Character.toString(check))) {
        	  
            found = false;
            t1 = false;
            break;
          }
          else {temp=temp.replaceFirst(Character.toString(check), "");
          
          //System.out.println("here "+temp);
          }
          
        }
       if(t1) break;
      }
      if (t1) found = true;
      current_window++;
    }
    if (found)
      System.out.println(tmp2.trim());
    else {
    	String s="";
      System.out.println(s);
    }
  }

}