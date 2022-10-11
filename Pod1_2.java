package Shivam;

import java.util.*;
public class Pod1_2 {
	
	public static void main(String[] args) {
		//input
		Scanner sc= new Scanner(System.in);
		int nop= sc.nextInt();
		int money = sc.nextInt();
		sc.nextLine();
		String input=sc.nextLine();
		//System.out.println(input);
		input=input.replaceAll("\\[", "");
		input=input.replaceAll("\\]", "");
		//System.out.println(input);
		String[] ip = input.split(",");
		ArrayList<Integer> prizes = new ArrayList<Integer>(nop);
		for(int i=0;i<nop;i++)
	    prizes.add( Integer.parseInt(ip[i]));
		//System.out.println(prizes.get(prizes.size()-1));
		//System.out.println(prizes);
		
		//logic
		Collections.sort(prizes);
		//System.out.println(prizes);
		
		int score=0;
		if(money <prizes.get(0)) score=0;
		else {
			//System.out.println("Initial: money : "+money +" - "+prizes);
			int k=0;
			while(prizes.size() > 0 | money >= prizes.get(0)) {
				
				money = money - prizes.get(0);
				score++;
				prizes.remove(0);
				k++;
				//System.out.println("Boost up: "+k+"  money : "+money+" - "+prizes+" - score : "+score);
				if(prizes.size()==0) break;
				
				if(money < prizes.get(0) && prizes.size()>1 && score>0) {
					score--;
					money = money + prizes.get(prizes.size()-1);
					prizes.remove(prizes.size()-1);
					//System.out.println("Boost down: "+k+"  money : "+money+" - "+prizes+" - score : "+score);		
				}	
			}
		}
		System.out.println(score);
			}
}
