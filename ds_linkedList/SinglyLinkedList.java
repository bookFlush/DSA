package ds_linkedList;

public class SinglyLinkedList {

	Node head;
	private int size;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	protected void insertAtEnd(int data) {
		Node temp = head;
		if (head == null) {
			head = new Node(data);
			size++;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			size++;
		}

	}

	public void insertAtStart(int data) {
		if (head == null) {
			head = new Node(data);
			size++;
			return;
		}

		Node temp = head;
		head = new Node(data);
		head.next = temp;
		size++;
	}

	public void insertAtPosition(int pos, int data) {
		if (size < pos) {
			System.out.println("Position doesn't exist.");
			return;
		}
		
		if(pos==1) {
			insertAtStart(data);
			return;
		}
		
		int count = 1;
		Node temp = head;
		
		while (temp != null) {
			
			if (count == pos - 1) {
				Node newNode = new Node(data);
				newNode.next = temp.next;
				temp.next = newNode;
				size++;
				return;
			}
			temp = temp.next;
			count++;
		}

	}

	public void print() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public void traverseRecursively(Node start) {
		Node current = start;
		if(current==null) {
			System.out.print("NULL");
			return;
		}
		System.out.print(current.data+" --> ");
		traverseRecursively(current.next);
	}

	public int deleteFront() {
		
		if(head==null) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}
		
		Node temp = head;
		head = head.next;
		size--;
		
		return temp.data;
	}

	public int deleteEnd() {
		if(head==null) {
			System.out.println("Linked list is empty");
			return Integer.MIN_VALUE;
		}
		
		if(head.next==null) {
			Node temp = head;
			head = null;
			size--;
			return temp.data;
		}
		
		Node temp = head;
		Node current = null;
		while(temp.next!=null) {
			current = temp;
			temp =  temp.next;
		}
		current.next = null;
		size--;
		return temp.data;
	}
	
	public boolean isEmpty() {
		return size<0;
	}

	public int deleteAtPosition(int pos) {

		if(isEmpty()) {
			System.out.println("Linked List is emp");
			return Integer.MIN_VALUE;
		}
		
		if(size<pos) {
			System.out.println("Position doesn't exist.");
			return Integer.MIN_VALUE;
		}
		
		if(pos == 1) {
			return deleteFront();
		}
		
		Node temp = head;
		int count = 1;
		while(temp!=null) {
			if(count == pos-1) {
				int data = temp.next.data;
				temp.next =  temp.next.next;
				size--;
				return data;
			}
			count++;
			temp = temp.next;
		}
		
		return 0;
	}

	public int getSize() {
		return size;
	}

}

class SinglyLLRunner {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(3, 100);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(2, 500);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(1,1000);
		list.print();
		System.out.println("Size: " + list.getSize());
		//list.traverseRecursively(list.head);
		list.deleteEnd();
		list.print();
		System.out.println("Size: " + list.getSize());
		list.deleteEnd();list.deleteEnd();list.deleteEnd();
		list.print();
		System.out.println("Deleted: "+list.deleteEnd());
		list.print();
		list.deleteEnd();list.deleteEnd();
		list.print();
		System.out.println("----------------------");
		list.deleteEnd();
		list.print();list.deleteEnd();list.deleteEnd();
		System.out.println("Size: " + list.getSize());
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);
		list.print();
		list.deleteFront();
		list.print();
		list.deleteFront();list.deleteFront();list.deleteFront();list.deleteFront();list.deleteFront();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);list.print();
		list.deleteAtPosition(2);
		list.print();
		list.deleteAtPosition(3);
		list.print();
		list.deleteAtPosition(1);
		list.print();
	}
}
