package linkedlist;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		Double[] values = { 24.15, 24.15, 3.33, 1.01, 19.30, 16.11 };
		DoublyLinkedList<Double> list = new DoublyLinkedList<>(values);

		// 1. Iterate over elements,  insert elements
		/*list.insertFirst(Double.valueOf(22));
		list.insertLast(Double.valueOf(50.1));
		list.insert(Double.valueOf(100), 1);
		list.insert(Double.valueOf(200), 20);//error
		list.insert(Double.valueOf(200), 0);//warning
		list.iterateLR();
		System.out.println();
		list.iterateRL();*/
		
		// 1. Iterate over elements,  remove elements
		
		System.out.println("The element " + list.removeFirst() + " was removed!");
		System.out.println("The element " + list.removeLast() + " was removed!");
		System.out.println("The element " + list.remove(2) + " was removed!");
		list.iterateLR();
		System.out.println();
		list.iterateRL();

	}

}
