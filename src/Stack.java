public class Stack<T> {
	
	private Stack<T> header;
	private T value;

    public Stack( T value) {
    	this.value = value;
    }

//    Push's a new value on too the Stack
    public void push(T value) {
        if(header==null) {
            header = new Stack<T>(value);
        }else {
            header = new Stack<T>(value);
        }

    }

//    Pop's a value off of the top of stack
    public T pop() {
		if(header==null) {
			return null;
		} else {
			T currentValue = header.getValue();
			header = header.getNext();
			return currentValue;
		}
	}
	
//  This is the top value of the Stack
	public T top() {
		if(header==null) {
			return null; 
		} else {
			T currentValue = header.getValue();
			return currentValue;
		}
	}

    private Stack<T> getNext() {
        return null;
    }

    private T getValue() {
        return null;
    }
}

