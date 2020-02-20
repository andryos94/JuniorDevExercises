package stackandqueue;

import java.util.LinkedList;

import java.util.List;

public class MyStack<T> {
	private List<T> l = new LinkedList<T>();

	public void push(T e) {
		l.add(0, e);
	}

	public T pop() {
		return l.remove(0);
	}
	
	public T peek() {
		return l.get(0);
	}
	
	@Override
	public String toString() {
		return l.toString();
	}
}