package stack;

public class stack {
	int size ;
	int[] stackarr ;
	int top;
	
	public stack(int s) {
		
		size=s;
		stackarr=new int[size];
		top=-1;
		
	}
	
	public void push(int v) {
		
		if(top==size-1) {
			System.out.println("stack is full");
		}else {
			stackarr[++top]=v;
		}
		
	}
	
	public int pop() {
		if(top==-1) {
			return -99;
			
		}else {
			
			
			int p=stackarr[top];
			System.out.println(p+"is removed");
			return stackarr[top--];
		}
	}
	
	public int peek() {
		if(top==-1) {
			return -99;
		}else {
			return stackarr[top];
		}
	}
	
	
	public boolean isEmpty() {
		return(top==-1);
	}
	
	
	public boolean isFull() {
		return(top==size-1);
	}
	
	public void display() {
		
		for(int i=0;i<=top;i++) {
			System.out.print(" "+stackarr[i]);
		}
	}
	
	

}




//main class 

package stack;

public class stackmain {
public static void main(String[] args) {
	
stack s1=new stack(3);
s1.push(10);
s1.push(45);
s1.push(67);


System.out.println(s1.peek());

s1.pop();
s1.pop();

s1.display();





}

}
