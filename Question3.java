package assignment4;

public class Question3 {

	public static void main(String[] args) {
		String s="2552";
		String reverse ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println(s +" is a palindrome");
		}
		else {
			System.out.println(s +" is not a palindrome");
		}

	}

}
