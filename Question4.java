package assignment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		int consonantCount=0;
		int vowelCount=0;
		int specialCharacterCount=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==65 || ch[i] == 69 || ch[i]==73 || ch[i]==79 || ch[i]==85 ||
					ch[i]==97 || ch[i] == 101 || ch[i]==105 || ch[i]==111 || ch[i]==117) {
				vowelCount++;
			}
			else if((ch[i]>=65 && ch[i]<=97)|| (ch[i]>=65 && ch[i]<=122)) {
				consonantCount++;
			}
			else if(!((ch[i]>=49 && ch[i]<=57)|| Character.isWhitespace(ch[i]))){
				specialCharacterCount++;
			}
		}
		System.out.println("No of vowels "+ vowelCount);
		System.out.println("No of consonant "+ consonantCount);
		System.out.println("No of special char "+ specialCharacterCount);

	}

}
