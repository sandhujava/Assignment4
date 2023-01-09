package assignment4;

public class Question1 {
    //Remove duplicate from string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helloo WorldwhE";
		s=s.toLowerCase();
		String newString = "" ;
		if(newString.length()==0) {
			newString+=s.charAt(0);
		}
		for(int i=1;i<s.length();i++) {
			boolean contains=false;
			for(int j=0;j<newString.toCharArray().length;j++) {
				if(newString.charAt(j)==s.charAt(i)) {
					contains=true;
				}
				
			}
			if(!contains) {
				newString+=s.charAt(i);
			}
		}
		System.out.println(newString);
	}

}
