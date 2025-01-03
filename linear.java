package Queue;

public class linear {
	private int maxsize;
	private int qarr[];
	private int rear;
	private int front;
	private int noi;
	
	public linear(int s) {
		
		maxsize=s;
		qarr=new int [maxsize];
		front=0;
		rear=-1;
		noi=0;
		
	}
	
	public void insert(int j) {
		if(rear==maxsize-1) {
			System.out.println("full");
		}else {
			qarr[rear++]=j;
			noi++;
		}
	}
	
	
	public int remove(){
		if(noi==0) {
			return -99;
		}else {
			noi--;
			return qarr[front++];
		}
		
	}
	
	public int peekfront() {
		if(noi==0) {
			return -99;
			
		}else {
			return qarr[front];
		}
	}
	
	
	public boolean isFull() {
		if(noi==maxsize-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		return (noi==0);
	}

}
