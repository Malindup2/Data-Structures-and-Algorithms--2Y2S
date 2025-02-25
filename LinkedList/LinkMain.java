package LinkedList;

public class LinkMain {

	public static void main(String[] args) {
			
		LinkedList l1=new LinkedList();
		
		l1.insertFirst(10);
		l1.insertFirst(20);
		l1.insertFirst(30);
		l1.insertFirst(40);
		
		l1.displayList();
		while(!l1.isEmpty()) {
			Link temp= l1.deleteFirst();
			System.out.println("deleting the "+temp.data);
		}
		
	}

}
