package Stack;

public class validator {
	
	String input;
	
	public  validator(String in) {
		
		this.input=in;
	}
	
	public void check() {
		
		int size=input.length();
		
		Stack stk = new Stack(size);
		
		for(int i=0; i<size;i++) {
			
			if(input.charAt(i)=='(') {
				
				stk.push(1);
				
			}else if(input.charAt(i)==')') {
				
				stk.pop();
			}
		}
		
		if(stk.isEmpty()) {
			
			System.out.println("Valid");
		}else {
			
			System.out.println("invalid");
			
		}
	}
	
	

}
