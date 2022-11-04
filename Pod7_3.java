package pod7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pod7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		char[] s1=s.toCharArray();
	    Arrays.sort(s1);
	    String s2 = new String(s1);
	    
	    char[] t1=t.toCharArray();
	    Arrays.sort(t1);
	    String t2 = new String(t1);
	    
	    if(s2.equals(t2))
	    	System.out.println("true");
	    else
	    	System.out.println("false");
	    
	}

}
