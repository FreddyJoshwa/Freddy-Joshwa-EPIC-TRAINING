package Lcube_problems;

public class vowelcount {

	public static void main(String[] args) {
		String a="Education";
		int count=0;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			
			if(c == 'a'|| c=='A' || c=='e' || c=='E'|| c== 'i' ||c== 'I'||c== 'o'||c=='O'||c=='u'||c=='U') {
				 count++;
			}
		}
		System.out.println("Vowels : "+count);
	

	}

}
