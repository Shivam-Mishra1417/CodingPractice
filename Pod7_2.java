package pod7;

import java.util.Arrays;
import java.util.Scanner;

public class Pod7_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean bool=false;
		int n = Integer.parseInt(sc.next());
		int sum = Integer.parseInt(sc.next());
		int[] nums = new int[n];
		
		for(int i=0;i<n;i++)
			nums[i] =  Integer.parseInt(sc.next());
		
		//System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n&&j!=i;j++) {
				
				if(nums[i]  + nums[j] == sum) {
					bool=true;
					break;
				}
			}
		}
		
		if(bool)
			System.out.println("true");
		else
			System.out.println("false");
			
	}

}
