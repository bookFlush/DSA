package ds_HashMap;

public class HashMap {
	
	private int SIZE = 5;
	private Node[] buckets = new Node[SIZE];
	
	class Node {
		int key;
		int value;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int getHash(int key) {
		return key%SIZE;
	}
	
	public void put(int key, int value) {
		int index = getHash(key);
		if(buckets[index]==null) {
			buckets[index] = new Node(key, value);
			return;
		}
		Node temp = buckets[index];
		Node prev = null;
		while(temp != null) {
			if (temp.key == key) {
				//throw new RuntimeException("Key already exists!");
				//System.out.println("Key already exists.");
				temp.value = value;//overriding the previous value
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		prev.next = new Node(key, value);
	}
	
	public int get(int key){
		int index = getHash(key);
		if(buckets[index]==null) {
			throw new RuntimeException("Key doesn't exist");
		}
		
		Node temp = buckets[index];
		while(temp != null) {
			if(temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		throw new RuntimeException("Key not present!");
	}
	
	public int remove(int key) {
		int index = getHash(key);
		if(buckets[index]==null) {
			throw new RuntimeException("Key doesn't exist");
		}
		
		Node temp = buckets[index];
		Node prev = null;
		while(temp != null) {
			if(temp.key == key) {
				prev.next = temp.next;
				return prev.key;
			}
			prev = temp;
			temp = temp.next;
		}
		throw new RuntimeException("Key not present!");
	}
	
}

class HashMapRunner{
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//hm.get(10);
		hm.put(10, 100);
		hm.put(20, 200);
		hm.put(20, 300);
		//int value = hm.get(30);
		//System.out.println(value);	//key not present
		System.out.println(hm.get(20));
		hm.remove(20);
		//System.out.println(hm.get(20)); //key not present
		hm.put(1,9);
		System.out.println(hm.get(1));
	}
}
