package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack<T extends Comparable<T>> {
	private Deque<T> stack = new LinkedList<T>();
	private Deque<T> mins = new LinkedList<T>();
	
	public MinStack(Deque<T> stack) {
		this.stack = stack;
	}
	
	public void push(T e) {
		if(this.stack.isEmpty()) {
			this.stack.push(e);
			this.mins.push(e);
			return;
		}
		this.stack.push(e);
		if(this.stack.peek().compareTo(this.mins.peek()) < 0) {
			this.mins.push(e);
		}
	}
	
	public T pop() {
		T element = this.stack.pop();
		if(element.compareTo(this.mins.peek()) == 0) {
			this.mins.pop();
		}
		return element;
	}
	
	public T peek() {
		return this.stack.peek();
	}
	
	public T getMinimum() {
		return this.mins.peek();
	}
	
	@Override
	public String toString() {
		return this.stack.toString();
	}
}
