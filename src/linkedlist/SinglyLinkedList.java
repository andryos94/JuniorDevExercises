package linkedlist;

public class SinglyLinkedList<T> {
	private Node listHead;

	// helper method to create a list from an array of values
	public SinglyLinkedList(T[] values) {
		Node head = new Node();
		Node it = head;
		for (T el : values) {
			Node newNode = new Node(el);
			it.next(newNode);
			it = it.next();
		}

		listHead = head.next();
	}
	
	public SinglyLinkedList() {
		
	}
	
	public void iterate() {
		Node it = listHead;
		while(it != null) {
			T crtElemen = it.value();
			System.out.println(crtElemen);
			it = it.next();
		}
	}
	
	public void insert(T newValue, int pos) {
		
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		public Node() {

		}

		public void value(T value) {
			this.value = value;
		}

		public T value() {
			return value;
		}

		public Node next() {
			return next;
		}

		public void next(Node next) {
			this.next = next;
		}
	}

}
