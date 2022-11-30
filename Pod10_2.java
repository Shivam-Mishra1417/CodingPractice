package pod10;

import java.util.Arrays;
import java.util.Scanner;

public class Pod10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] ar = s.toCharArray();
		int[] ct = new int[52];
		for(int i=0;i<ar.length;i++) {
			//System.out.println((int)ar[i]);
			int x = ar[i];
			if(x>=97 && x<=122) {
				ct[x-71]+=1;
			}
			else if(x>=65 && x<=90) {
				ct[x-65]+=1;
			}
		}
		
		//System.out.println(Arrays.toString(ct));
		Arrays.sort(ct);
		int even_ans=0,odd_ans=0;
		boolean even=false,odd=false;
		for(int i=0;i<ct.length;i++) {
			if(ct[i] > 0) {
				//System.out.println("element >> "+ct[i]);
				
				if(even_ans==0 && ct[i]%2==0 && !even) {
					even_ans=ct[i];
				even=true;	
				}
				else {
					if(even)
					if(even_ans%2==0)
						even_ans+=ct[i];
					else
					{
						if(ct[i]%2==0)
							even_ans+=ct[i];
					}
				}
				
				if(ct[i]%2!=0) { // if frequencies are 1 3 5 .. for this case it's not similar to even case
					if(ct[i] > odd_ans)
					odd_ans=ct[i];
				odd=true;	
				}
				else {
					if(odd)
					if(odd_ans%2==0)
						odd_ans+=ct[i];
					else
					{
						if(ct[i]%2==0)
							odd_ans+=ct[i];
					}
				}
				
				//System.out.println(even_ans+"   "+odd_ans);

				
			}
		}
		if(even_ans>=odd_ans)
		System.out.println(even_ans);
		else
			System.out.println(odd_ans);
	}
}
