package assignment4;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scan.nextLine();
		
		System.out.println("Enter second String");
		String s2 = scan.nextLine();
		
		boolean similar=true;
		s1=convertLower(s1);
		s2=convertLower(s2);
		if(s1.length()!=s2.length()) {
			System.out.println("Both strings are of different length,so they are not Anagram");
			return;
		}
		char [] s1Char = sortChar(s1.toCharArray());
		char [] s2Char = sortChar(s2.toCharArray());
		
		
		for(int i=0;i<s1Char.length;i++) {
			if(s1Char[i]!=s2Char[i]) {
				similar=false;
				System.out.println("They are not Anagram");
				break;
			}
		}
		if(similar) {
			System.out.println("They are  Anagram");
		}
	}
	
	public static String convertLower(String mix) {
		char[] ch = mix.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char) (ch[i]+32);
			}
		}
		for(char c: ch) {
			if(c!=' ') {
				s+=c;
			}
			 
		}
		return s;
		
	}
	
	public static char[] sortChar(char [] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					char temp =arr[j];
					arr[j] = arr [j-1];
					arr[j-1] = temp;
				
			}
		}
		
		
		}
		return arr;
		

		
	}


}
