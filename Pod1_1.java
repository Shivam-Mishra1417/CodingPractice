package Shivam;
import java.util.*;
public class Pod1_1 {

	public static void main(String[] args) {
		//input
		 Scanner sc = new Scanner(System.in) ;
		 int n = sc.nextInt();
		 boolean[] roomtaken = new boolean[n+1];
 		 sc.nextLine();
		String ip = sc.nextLine();
		//logic
		 String[] nums = ip.split(" ");
		 for(int i=0;i<nums.length;i++) {

			 int x=Integer.parseInt(nums[i]);
			 if(!roomtaken[x]) {roomtaken[x]=true;System.out.print(x+" ");}
			 else {
				 for(int j=x;j<=n;j++) {
					 if(!roomtaken[j]) {
						 roomtaken[j] = true;
						 System.out.print(j+" ");
						 break;
					 }
				 }
			 }
			 
		 }
		 
		 
	}
}
