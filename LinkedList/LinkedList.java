package LinkedList;


public class LinkedList {
	private Link first;
	
	public LinkedList() {
		
		first=null;
	}
	
	public boolean isEmpty() {
		
		return (first==null);
	}
	
	public void displayList() {
		
		Link current=first;
		
		while(current!=null) {
			
			current.displaylink();
			current=current.next;
			
		}
		System.out.println("");
		
	}
	
	//find the value
	public Link  find(int key ) {
		Link current=first;
		
		while(current!=null) {
			if(current.data==key) {
				return  current;
			}else {
				current=current.next;
			}
		}
		
		return null;
	}

	//insertFist
	public void insertFirst(int key) {
		
		Link newLink =  new Link(key);
		
		 newLink.next=first;
		 first=newLink;
		 
	}
	
	
	//deleteFirst
 public Link deleteFirst( ) {
	 
	 Link temp=first;
	 first=first.next;
	 
	 return temp;  //if need to return the first link
	 
 }
	
	
}
