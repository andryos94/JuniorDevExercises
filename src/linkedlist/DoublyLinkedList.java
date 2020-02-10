package linkedlist;

public class DoublyLinkedList<E> {
	private Node listHead;
	private Node listTail;

	public DoublyLinkedList(E[] values) {
		Node head = new Node();
		Node tail = new Node();
		Node it = head;
		Node prevNode = null;

		for (E el : values) {
			Node nextNode = new Node(el);
			it.next(nextNode);
			it = it.next();
			it.prev(prevNode);
			prevNode = nextNode;
		}
		tail.prev(prevNode);
		it.next(null);
		/// tail e referinta ultimului element

		listHead = head.next();
		listTail = tail.prev();
	}

	public void iterateLR() {
		Node it = listHead;
		while (it != null) {
			E crtElement = it.value();
			System.out.println(crtElement);
			it = it.next();
		}
	}

	public void iterateRL() {
		Node it = listTail;
		while (it != null) {
			E crtElement = it.value();
			System.out.println(crtElement);
			it = it.prev();
		}
	}

	public void insert(E newValue, int pos) {
		int length = 1;
		Node it = listHead;
		for (int i = 0; i < pos - 1; i++) {
			it = it.next();
			length++;
			if (it == null) {
				System.out.println("Error: The length of the linked list is: " + length + " (use the method"
						+ " insertLast(E newValue)");
				return;
			}
		}

		if (pos == 0) {
			System.out.println("Warning: You should use the method insertFirst(E newValue)");
			return;
		}

		Node newNode = new Node(newValue);
		newNode.next(it.next());
		newNode.prev(it);
		it.next(newNode);
		it = it.next().next();
		it.prev(newNode);
	}

	public void insertFirst(E newValue) {
		Node it = listHead;
		Node newNode = new Node(newValue);
		newNode.next(it);
		newNode.prev(null);
		it.prev(newNode);

		listHead = newNode;
	}

	public void insertLast(E newValue) {
		Node it = listTail;
		Node newNode = new Node(newValue);
		newNode.prev(it);
		it.next(newNode);
		newNode.next(null);
		listTail = newNode;
	}
	
	public E remove(int pos) {
		Node it = listHead;
		for(int i = 0; i < pos - 1; i++) {
			it = it.next();//last "it" is the element *before the elem to be removed
		}
		E removedEl = it.next().value();
		it.next(it.next().next());
		it = it.next();
		it.prev(it.prev().prev());
		
		return removedEl;
	}
	
	public E removeFirst() {
		Node it = listHead;
		E removedEl = it.value();
		it = it.next();
		it.prev(null);
		listHead = it;
		
		return removedEl;
	}
	
	public E removeLast() {
		Node it = listTail;
		E removedEl = it.value();
		it = it.prev();
		it.next(null);
		listTail = it;
		
		return removedEl;
	}

	private class Node {
		private E value;
		private Node next;
		private Node prev;

		public Node(E value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

		public Node(E value) {
			this(value, null, null);
		}

		public Node() {

		}

		public void value(E value) {
			this.value = value;
		}

		public Node next() {
			return next;
		}

		public void next(Node next) {
			this.next = next;
		}

		public Node prev() {
			return prev;
		}

		public void prev(Node prev) {
			this.prev = prev;
		}

		public E value() {
			return value;
		}
	}
}
