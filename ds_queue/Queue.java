package ds_queue;

public class Queue {
	
	class Node {
		Node next;
		int data;

		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}
	
	private Node start, end;
	private int size = 0;
	
	public void push(int data) {
		Node temp = new Node(data);

		if (start == null) {
			start = temp;
			end = temp;
			size++;
			return;
		}

		end.next = temp;
		end = temp;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		
		Node temp = start;
		start = start.next;
		size--;
		
		return temp.data;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		
		return start.data;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void display() {
		Node temp = start;
		if (temp == null) {
			System.out.println("Stack is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
}

class QueueRunner{
	public static void main(String[] args) {
		Queue que = new Queue();
		System.out.println(que.peek());
		que.pop();
		que.push(10);
		que.display();
		System.out.println(que.getSize());
		que.push(20);que.push(30);
		que.display();
		System.out.println(que.getSize());
		que.pop();
		que.display();
		System.out.println(que.getSize());
		que.pop();que.display();que.pop();que.display();que.pop();
	}
}

