package Shivam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Pod5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] langs= new String[n];
		HashMap<String,String> map = new HashMap<String,String>();
		for(int i=0;i<n;i++) {
			//System.out.println("lang "+i);
		langs[i] = sc.nextLine();
		
		}
		
		for(int i=0;i<n;i++) {
			String[] words = langs[i].split("[|,|!|.|?|(|)|]| ");
			//System.out.println("lang is -> "+Arrays.toString(words));
			for(int j=1;j<words.length;j++) {
				//System.out.println("put "+j);
				if(!(map.containsKey(words[j])))
					map.put(words[j].toLowerCase(), words[0]);
			}
		}
		//System.out.println("Map is ready");
		sc.nextLine();
		//String books = sc.nextLine();
		ArrayList<String> books = new ArrayList<String>();
		String b="";
		while(sc.hasNextLine()==true){
			b = sc.nextLine();
			if(b.equals("")) break;
			books.add(b);
		}
		
		
//		System.out.println("No of langs "+n);
//		System.out.println("langs - "+ Arrays.toString(langs));
//		System.out.println("books -"+books);
		//System.out.println("map - "+map);
		for(int i=0;i<books.size();i++) {
			//System.out.println("Checking book - "+books.get(i));
			String[] words = books.get(i).split("[|,|!|.|?|(|)|]| ");
			String[] temp = books.get(i).split(" ");
		//System.out.println("words are - "+Arrays.toString(words));
			//System.out.println("temp is - "+Arrays.toString(temp));
			for(int j=0;j<words.length;j++) {
				String check = words[j].replaceAll("[,!.;?() ]", "");
				//System.out.println("Looking for word - "+check);
				if(map.containsKey(check.toLowerCase()))
				{
					//System.out.print(">>>>>>>>>>>>>>>>>>Ans is ");
					System.out.println(map.get(check.toLowerCase()));
					break;
				}
			}
			
		}
	}

}
