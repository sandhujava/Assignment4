package assignment4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int [] arr = new int[256];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scan.nextLine();
		
	    s1=s1.replace(" ", "");
	    
	    boolean exist=false;
	    char[] ch=new char[s1.length()];
	    for(int i=0;i<s1.length();i++) {
	    	for(int j=0;j<s1.length();j++) {
	    		if( ch[j]==s1.charAt(i)) {
	    			exist=true;
	    			break;
	    		}
	    	}
	    	if(!exist) {
	    		ch[i]=s1.charAt(i);
	    	}
	    	else {
	    		break;
	    	}
	    }
	    if(!exist) {
	    	System.out.println("It has unique char");
	    	for(char c:ch) {
	    		System.out.println(c);
	    	}
	    }else {
	    	System.out.println("It has duplicate characters");
	    }
	}

}
