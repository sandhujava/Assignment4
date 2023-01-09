package assignment4;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		
				boolean panagram=false;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first String");
				String s1 = scan.nextLine();
				s1=s1.toUpperCase();
				s1=s1.replace(" ", "");
				
				char[] ch=s1.toCharArray();
				
				int[] ar=new int[26];
				
				for(int i=0;i<ch.length;i++)
				{
					int index=ch[i]-65;
					ar[index]++;  
				}
				for(int i=0; i<ar.length;i++)
				{
					if(ar[i]==0)
					{
						
						panagram=true;
					}
				}
				if(panagram==false)
				{
				System.out.println("It's pangram");
				}
				else {
					System.out.println("It's not pangram");
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
	
	


}
