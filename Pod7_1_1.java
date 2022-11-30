package pod7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pod7_1_1 {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[]lines = new String[2];
		for(int i=0;i<lines.length;i++) {
			lines[i]=sc.nextLine();
		}
		String[]a=lines[0].split(" ");
		String[]b=lines[1].split(" ");
		
		Queue<Integer>first = new LinkedList<Integer>();
		Queue<Integer>second = new LinkedList<Integer>();
		Queue<Integer>fc = new LinkedList<Integer>();
		Queue<Integer>sec = new LinkedList<Integer>();
		int suma=0,sumb=0;
		for(int i=0;i<a.length;i++) {
			first.add(Integer.parseInt(a[i]));
			fc.add(Integer.parseInt(a[i]));
			suma+=Integer.parseInt(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			second.add(Integer.parseInt(b[i]));
			sec.add(Integer.parseInt(b[i]));
			sumb+=Integer.parseInt(b[i]);
		}
		
		//System.out.println(first+" :: "+second);
		//System.out.println(suma+" :: "+sumb);
		boolean doable1 = true,doable2=true;
		if((suma+sumb)%2 != 0) {
			doable1=false;
		    System.out.println("-1");
		    //System.exit(1);
		}
		
		int mid = (suma+sumb)/2;
		
		if(doable1) {
			while(suma != mid  && doable2) {
				//System.out.println(count+" "+first+" ::: "+second);
				//System.out.println("suma - "+suma);
				if(suma < mid) {
					//System.out.println("Less");
				count++;
				int b1 = second.remove();
				first.add(b1);
				}
				else {
					//System.out.println("More");
					count++;
					int a1 = first.remove();
					second.add(a1);
				}
				ArrayList<Integer> temp = new ArrayList<Integer>(first);
				suma=0;
				for(int i=0;i<temp.size();i++)
					suma+=temp.get(i); 
				
			
				if(count > 2*(fc.size() + sec.size())) {
				//System.out.println("Count max exceeded");
				doable2=false;
					break;
				}
			}
			if(doable2)
			System.out.println(count);
			else
				System.out.println("-1");
		}
		
	}

}
