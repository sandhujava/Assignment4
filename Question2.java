package assignment4;

public class Question2 {
    //Print duplicate from string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helloo World";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
				
			}
			if(count>0 && ch[i]!=' ') {
				System.out.println("Character "+ch[i]+" repeated "+(count+1)+" times");
			}
			
		}
		
	}

}
