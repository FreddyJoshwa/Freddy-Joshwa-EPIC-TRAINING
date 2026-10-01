package clg_placement;

public class cnt_num {

	public static void main(String[] args) {

	
		String a="211122111";
		for(int j=0;j<a.length();j++) {
			int count=1;

		for(int i=j+1;i<a.length();i++) {			
			if(a.charAt(j)!=a.charAt(i)) {
				break;
			}
			else {
				count++;
				j++;
			}
			
			
		}
		System.out.print(count);
		System.out.print(a.charAt(j));
		
		}
		}
	}


