package stackandqueue;

import java.util.LinkedList;

import java.util.List;

public class MyStack<T> {
	private List<T> l = new LinkedList<T>();

	public void push(T e) {
		l.add(e);
	}

	public T pop() {
		return l.remove(0);
	}
	
	public T peek() {
		return l.get(0);
	}
}