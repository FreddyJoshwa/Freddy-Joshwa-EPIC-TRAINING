package stack;

public class task_1 {

	public static void main(String[] args) {

		String inp="3(a)";
		
		char[] stack=new char[inp.length()];
		int top=-1,num=0;
		String ans="";
		String a="";
		
		for(int i=0;i<inp.length();i++) {
			top++;
			stack[top]=inp.charAt(i);
		}
		
		for(int i=inp.length()-2;i>=0;i--) {
			
			if(stack[i]=='(') {
				char temp=stack[i+1];
				 num=((int)temp)-48;
				break;
			}
			else {
				
				a+=stack[i];
			}
		}
		System.out.println(a);
		
	}

}
