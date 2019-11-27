package com.courses;

import java.util.Arrays;

public class MyIntArrayList {
	private int[] elements;
	private int size;

	public MyIntArrayList() {
		this(10);
	}

	public MyIntArrayList(MyIntArrayList c) {
		this.elements = c.elements;
		this.size = c.size;
	}

	public MyIntArrayList(int initialCapacity) {
		this.elements = new int[initialCapacity];
	}

	public void add(int index, int element) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.size++;

		int prev = this.elements[index];
		this.elements[index] = element;

		for (int i = index + 1; i < this.size(); i++) {
			int next = this.elements[i];
			this.elements[i] = prev;
			prev = next;
		}
	}

	public boolean add(int e) {
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
		}

		this.elements[size] = e;
		this.size++;

		return true;
	}

	public int size() {
		return this.size;
	}

	public int indexOf(int e) {
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(int e) {
		if (indexOf(e) >= 0) {
			return true;
		}
		return false;
	}

	public int get(int index) {
		return this.elements[index];
	}

	public int lastIndexOf(int e) {
		for (int i = this.size - 1; i >= 0; i--) {
			if (this.elements[i] == e) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(int e) {
		int indexRemoved = indexOf(e);
		int removedElement = removeElementAtIndex(indexRemoved);
		if (removedElement >= 0) {
			return true;
		}
		return false;
	}

	public int removeElementAtIndex(int index) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println(
					"Throwing IndexOutOfBoundsException when trying to" + " remove element at position " + index);
			return -1;
		}

		int removedElement = this.elements[index];
		for (int i = index; i < this.size; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		this.size--;

		return removedElement;
	}

	public void clear() {
		this.size = 0;
	}

	public int set(int index, int e) {
		if (index < 0 || index >= this.size) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to set" + " the element " + e
					+ " at position " + index);
			return -1;
		}

		int replacedElement = this.elements[index];
		this.elements[index] = e;
		return replacedElement;
	}

	public boolean addAll(MyIntArrayList c) {
		if (c.size() == 0) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to add the all elements " + c);
			return false;
		}
		int prevLength = this.size();
		this.elements = Arrays.copyOf(elements, prevLength + c.size());
		this.size += c.size();
		int j = 0;
		for (int i = prevLength; i < this.elements.length; i++) {
			this.elements[i] = c.get(j);
			j++;
		}

		return true;
	}

	public boolean addAll(int index, MyIntArrayList c) {
		if (c.size() == 0) {
			// should throw IndexOutOfBoundsException
			System.out.println("Throwing IndexOutOfBoundsException when trying to add the all elements " + c);
			return false;
		}

		int prevLength = this.size();
		this.elements = Arrays.copyOf(elements, prevLength + c.size());
		this.size += c.size();

		int[] copyOfCurrentElements = new int[prevLength - index];
		int j = 0;
		for (int i = index; i < prevLength; i++) {
			copyOfCurrentElements[j] = this.elements[i];
			j++;
		}

		j = 0;
		int k = 0;
		for (int i = index; i < this.size(); i++) {
			if ((i >= index) && (i < index + c.size())) {
				this.elements[i] = c.get(j);
				j++;
				continue;
			}
			this.elements[i] = copyOfCurrentElements[k];
			k++;
		}

		return true;
	}

	public int[] toArray() {
		return this.elements;
	}

	public void ensureCapacity(int minCapacity) {
		if (minCapacity > this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, minCapacity);
		}
	}

	public void trimToSize() {
		if (this.elements.length > this.size()) {
			this.elements = Arrays.copyOf(this.elements, this.size());
		}
	}

}
