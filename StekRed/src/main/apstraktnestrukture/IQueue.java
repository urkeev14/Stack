package main.apstraktnestrukture;

public interface IQueue {

	public boolean enqueue(int e);
	public int dequeue();
	public boolean isEmpty();
	public boolean isFull();
	public int peekFirst();
	public int peekLast();
	public int count();
	
}
