package main.statickesturkture;

import main.apstraktnestrukture.IStack;

public class StaticStack implements IStack {

	private int[] niz;
	private int vrh; //indeks poslednjeg unetog elementa
	
	public StaticStack(int dimenzija) {
		niz = new int[dimenzija];
	}
	
	public StaticStack() {
		this(4);
	}
	
	@Override
	public boolean push(int e) {
		return false;
	}

	@Override
	public int pop() {
		return 0;
	}

	@Override
	public int peek() {
		return 0;
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
