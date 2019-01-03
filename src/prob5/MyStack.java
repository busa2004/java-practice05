package prob5;

public class MyStack {
	private int top=-1;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
	}

	public void push(String s) {
		
		if(top == buffer.length-1) {
			String[] temp = new String[buffer.length*2];
			for(int i = 0 ; i < buffer.length ; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
		}
		
		buffer[++top] = s;
	}

	public String pop() throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException();
		}
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}