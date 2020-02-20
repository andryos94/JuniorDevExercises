package stackandqueue;

public class Main {

	public static void main(String[] args) {
		/*MyStack<Integer> mystack = new MyStack<Integer>();
		mystack.push(23);
		mystack.push(2);
		mystack.push(-8);
		System.out.println(mystack);
		System.out.println(mystack.peek());
		System.out.println(mystack);
		System.out.println(mystack.pop());
		System.out.println(mystack);*/
		
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		myQueue.offer(23);
		myQueue.offer(3);
		myQueue.offer(-2);
		myQueue.offer(5);
		myQueue.offer(10);
		System.out.println(myQueue);
		
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.peek());
		System.out.println(myQueue);
		
	}

}
