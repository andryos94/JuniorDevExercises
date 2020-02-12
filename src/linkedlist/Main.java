package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void removeDuplicates(LinkedList<Integer> headList) {
		ListIterator<Integer> li = headList.listIterator();
		int prev = 0;
		while (li.hasNext()) {
			Integer el = li.next();
			if (prev == el.intValue()) {
				li.remove();
				continue;
			}
			prev = el.intValue();
		}
	}

	public static void removeDuplicates2(LinkedList<Integer> headList) {
		ListIterator<Integer> li = headList.listIterator();
		boolean tag = false;

		while (li.hasNext()) {
			Integer prevEl = li.next();
			if (!li.hasNext()) {
				break;
			}
			Integer el = li.next();
			if (el.intValue() == prevEl.intValue()) {
				li.remove();
				li.previous();
				tag = true;
				continue;
			}

			if (tag) {
				li.previous();
				li.previous();
				li.remove();
				tag = false;
				continue;
			}
			li.previous();
		}
	}

	public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
		ListIterator<Integer> itOp1 = op1.listIterator(op1.size());
		ListIterator<Integer> itOp2 = op2.listIterator(op2.size());

		LinkedList<Integer> result = new LinkedList<Integer>();

		int sum = 0;
		int m = 0;
		while (itOp1.hasPrevious()) {
			if (!itOp2.hasPrevious()) {
				sum = itOp1.previous().intValue() + m;
			} else {
				sum = itOp1.previous().intValue() + itOp2.previous().intValue() + m;
			}

			if (sum > 9) {
				int r = sum % 10;
				result.addFirst(Integer.valueOf(r));
				m = 1;
				continue;
			}
			result.addFirst(Integer.valueOf(sum));
			m = 0;
		}
		
		if(m == 1) {
			result.addFirst(Integer.valueOf(1));
		}
		
		return result;
	}
	
	public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		ListIterator<Integer> itL1 = l1.listIterator();
		ListIterator<Integer> itL2 = l2.listIterator();
		
		while(itL2.hasNext()) {
			Integer prev = itL1.next();
			if(!itL1.hasNext()) {
				itL1.add(itL2.next());
				break;
			}
			
			Integer next = itL1.next();
			Integer mid = itL2.next();
			if(prev.intValue() <= mid.intValue() && next.intValue() > mid.intValue()) {
				itL1.previous();
				itL1.add(mid);
				itL1.previous();
			} else {
				itL2.previous();
				itL1.previous();
			}
		}
		
		return l1;
	}
	
	public static LinkedList<Integer> rotateRight(LinkedList<Integer> head, int k) {
		for(int i = 0; i < k; i++) {
			head.addFirst(head.removeLast());
		}
		return head;
	}

	public static void main(String[] args) {

		LinkedList<Integer> doublyLinkedList = new LinkedList<Integer>(Arrays.asList(1, 2, 2, 4, 9, 9, 9, 10));

		/*removeDuplicates(doublyLinkedList);
		System.out.println(doublyLinkedList + "\n");

		removeDuplicates2(doublyLinkedList);
		System.out.println(doublyLinkedList + "\n");*/
		
		LinkedList<Integer> op1 = new LinkedList<Integer>(Arrays.asList(2, 1, 7, 8));
		LinkedList<Integer> op2 = new LinkedList<Integer>(Arrays.asList(5, 9, 6));
		System.out.println(sum(op1, op2) + "\n");
		
		op1 = new LinkedList<Integer>(Arrays.asList(9,9,9));
		op2 = new LinkedList<Integer>(Arrays.asList(9));
		System.out.println(sum(op1, op2) + "\n");
		
		op2 = new LinkedList<Integer>(Arrays.asList(1));
		System.out.println(sum(op1, op2) + "\n");
		
		op1 = new LinkedList<Integer>(Arrays.asList(1,2,4));
		op2 = new LinkedList<Integer>(Arrays.asList(1,3,4));
		System.out.println(mergeTwoLists(op1, op2) + "\n");
		
		System.out.println(mergeTwoLists(op1, op2) + "\n");
		
		System.out.println(rotateRight(op1, 3) + "\n");
		
		System.out.println(rotateRight(op1, 6) + "\n");
	}

}
