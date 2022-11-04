package Shivam;

import java.util.Scanner;

public class Pod6_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String s = sc.next();
		String output ="";
		for(int i=0;i<s.length();i++) {
			int x = Integer.parseInt(s.substring(s.length()-i-1,s.length()-i))*(int)Math.pow(10, i);
			//System.out.println(">"+x);
			String op = roman(x);
			//System.out.println(op);
			output=op+output;
			//System.out.println(output);
		}
		System.out.println(output);
	}
	
	public static String roman(int n) {
		String out="";
		if(n==1) return "I";
		if(n==2) return "II";
		if(n==3) return "III";
		if(n==4) return "IV";
		if(n==5) return "V";
		if(n==6) return "VI";
		if(n==7) return "VII";
		if(n==8) return "VIII";
		if(n==9) return "IX";
		if(n==10) return "X";
		if(n==50) return "L";
		if(n==100) return "C";
		if(n==500) return "D";
		if(n==1000) return "M";
		
		if(n%1000==0) {
			//System.out.println("1000--M"+(n%1000));
			for(int i=0;i<n/1000;i++) {
				out+="M";
			}
		}
		else if(n%100==0) {
			if(n==400) out ="CD";
			else if(n==900) out = "CM";
			else if (n==500) out = "D";
			else if (n>500) {out="D";
			for(int i=0;i<(n-500)/100;i++)
				out+="C";
			}
			else
				if(n<400)
				for(int i=0;i<n/100;i++)
					out+="C";
			    
		}
		else if(n%10==0) {
			if(n==40) out ="XL";
			else if(n==90) out = "XC";
			else if (n==50) out = "L";
			else if (n>50) {out="L";
			for(int i=0;i<(n-50)/10;i++)
				out+="X";
			}
			else
				if(n<400)
				for(int i=0;i<n/10;i++)
					out+="X";
			    
		}
		return out;
	}

}
