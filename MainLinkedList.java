package linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {
		
		 MyLinkedList myll = new MyLinkedList();
		 
		// myll.add(12);
		 //myll.add(56);
		 
		 for(int i=0; i<=20; i++) 
			 myll.add(i);
		 
		 myll.printList();

	}

}
