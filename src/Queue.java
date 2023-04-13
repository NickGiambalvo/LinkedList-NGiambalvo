public class Queue<T> {
	private Queue<T> header;
	private T value;
	private int size;
	public int MAXSIZE = 25;

    public int getMAXSIZE() {
		return MAXSIZE;
	}

	public void setMAXSIZE(int mAXSIZE) {
		MAXSIZE = mAXSIZE; 
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Queue(T value) {
    	this.value = value;
    }

//    Push's a new value on too the Queue
    public void push(T value) {
        if(header==null) {
            header = new Queue<T>(value);
        }else {
            header = new Queue<T>(value);
        }
        size ++;
    }
    
//    Removes a value from opposite end of where a new value is being added to the Queue
    public int pop() {
        if(header==null) {
            return 0;
        } else {
            int currentValue = header.getValue();
            header = header.getNext();
            size --;
            return currentValue;
        }
        
    }

//    This is the top value of the Queue
    public int top() {
        if(header==null) {
            return 0;
        } else {
            int currentValue = header.getValue();
            return currentValue;
        }
    }
    

    private Queue<T> getNext() {
        return null;
    }

    private int getValue() {
        return 0;
    }
}

