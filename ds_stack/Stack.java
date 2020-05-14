package ds_stack;

public class Stack {

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	Node start, top;
	int size = 0;

	public void push(int data) {
		Node temp = new Node(data);

		if (start == null) {
			start = temp;
			top = temp;
			size++;
			return;
		}

		top.next = temp;
		top = temp;
		size++;
	}

	public int pop() {
		if (top == null) {
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}

		Node temp = start;
		if (start == top) {
			start = top = null;
			size--;
			return temp.data;
		}
		while (temp.next != top) {
			temp = temp.next;
		}
		temp.next = null;
		top = temp;
		size--;

		return temp.data;
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		return top.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return start == null;
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

class StackRunner {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.peek());
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		System.out.println(stack.peek());
		stack.push(30);
		stack.display();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();stack.pop();stack.pop();stack.pop();
	}
}
