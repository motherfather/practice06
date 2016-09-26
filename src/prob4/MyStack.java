package prob4;

//1 MainApp.java , Stack.java 파일은 수정하지 않습니다.
//2 java.util 패키지의 클래스는 사용할 수 없습니다.

public class MyStack implements Stack {
	private int top = 0;
	String[] stack;
	StringBuffer sb;

	public MyStack(int stackNum) {
		stack = new String[stackNum];
	}

	@Override
	public void push(String item) {
		if (top < size()) {
			stack[top] = item;
			top++;
		} else if (top >= size()) {
			String[] buffer = new String[size() * 2];
			System.arraycopy(stack, 0 , buffer, 0, top);

			buffer[top] = item;
			top++;
			stack = new String[buffer.length];
			System.arraycopy(buffer, 0, stack, 0, top);
		}
	}

	@Override
	public String pop() throws MyStackException {
		if(top == 0) {
			MyStackException ex = new MyStackException();
			throw ex; 
//			throw new MyStackException();
		}
//		String s = stack[top - 1];
//		top--;
//		return s;
		return stack[--top];
	}

	@Override
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return stack.length;
	}

}
