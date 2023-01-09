package assignment4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		int [] arr = new int[256];
		char c=(char)0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scan.nextLine();
		
	    s1=s1.replace(" ", "");
	    
	    
	    for(int i=0;i<s1.length();i++) {
	    	arr[s1.charAt(i)]++;
	    }
	    int max=arr[0];
	    
	    for(int i=1;i<arr.length;i++) {
	    	if(max<arr[i] ) {
	    		max=arr[i];
	    		c=(char)i;
	    	}
	    }
	    System.out.println(c + " has Max occurancce of "+ max);
	    
	    	
	}
}


