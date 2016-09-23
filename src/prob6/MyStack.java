package prob6;

//1 MainApp.java , Stack.java 파일은 수정하지 않습니다.
//2 java.util 패키지의 클래스는 사용할 수 없습니다.

public class MyStack<T> implements Stack<T> {
	private int top = 0;
	private T[] stack;
//	private StringBuffer sb;

	public MyStack(int stackNum) {
		stack = (T[])new Object[stackNum];
	}

	@Override
	public void push(T item) {
		if (top < size()) {
			stack[top] = item;
			top++;
		} else if (top >= size()) {
			T[] buffer = (T[]) new Object[size() * 2];
			System.arraycopy(stack, 0 , buffer, 0, top);

			buffer[top] = item;
			top++;
			stack = (T[]) new Object[buffer.length];
			System.arraycopy(buffer, 0, stack, 0, top);
		}
	}

	@Override
	public T pop() throws MyStackException {
		if(top == 0) {
//			MyStackException ex = new MyStackException();
//			throw ex;
			throw new MyStackException();
//			new MyStackException();
		}
//		String s = stack[top - 1];
//		top--;
//		return s;
		return stack[--top];
	}

	@Override
	public boolean isEmpty() {
//		if (top == 0) {
//			return true;
//		}
//		return false;
		return top == 0;
	}

	@Override
	public int size() {
		return stack.length;
	}

}
