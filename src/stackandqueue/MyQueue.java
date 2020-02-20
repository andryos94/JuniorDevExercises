package stackandqueue;

public class MyQueue<T> {
	private int size;
	private int head;
	private int tail;
	private T[] v;

	public MyQueue() {
		this.v = (T[]) new Object[4];
	}

	public boolean offer(T e) {
		v[tail] = e;
		tail++;
		if (tail == v.length) {
			tail = 0;
		}
		size++;
		if (size == v.length) {
			T[] temp = (T[]) new Object[v.length * 2];
			int i = 0;
			while (size > 0) {
				temp[i] = v[head];
				size--;
				i++;
				head = (head + 1) % v.length;
			}
			head = 0;
			tail = i;
			size = i;
			this.v = temp;
		}
		return true;
	}
	
	public T poll() {
		if(size == 0) {
			return null;
		}
		T e = v[head];
		head++;
		if(head == v.length) {
			head = 0;
		}
		size--;
		return e;
	}
	
	public T peek() {
		if(size == 0) {
			return null;
		}
		return v[head];
	}
	
	@Override
	public String toString() {
		String s = "[";
		for(int i = head; i < tail; i++) {
			s = s + v[i] + " ";
		}
		s = s + "]";
		return s;
	}
}
