import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList<T extends Comparable<T>> extends OrderedDataStructure<T> implements Iterator<T>{
	
	private int size;
	private LinkedListNode<T> header;
	
	public LinkedList() {
		super();
		header = null;
		size = 0;
	}
	
	public LinkedList(ArrayList<T> value) {
		super();
	}
	
	
//	Converts values to strings, allows user to see values
//	public String toString() {
//		if(header == null) {
//			return "List is Empty";
//		}else {
//			String rtn = " ";
//			LinkedListNode<T> current = header;
//			while(current!=null) {
//				rtn += current.getValue()+ " , ";
//				current = current.getNext();
//			}
//			return rtn;
//		}
//	}
////	Helps out toString class by using recursion
//	private String toStringRecursion(LinkedListNode<T> current) {
//		if(current.getNext() == null) {
//            return current.getValue().toString();
//        } else {
//            return current.getValue().toString() + ", " + toStringRecursion(current.getNext());
//        }
//	}
//	
//	Gets the size of the Linked List
	public int getSize(int value) {
		int count = 0;
		LinkedListNode<T> currentNode = header;
		while(currentNode != null) {
			count ++;
			currentNode = currentNode.getNext();
		}
		return value;
	}
	
//	Gets the current node and its index, makes sure node is within the index and is a usable value
	public T get(int index)throws Exception {
		if(index < 0) {
			throw new Exception("Out of Bounds");
		}
		if(index > size) {
			throw new Exception("Out of Bounds");
		}
		if(header==null || index < 0) {
			return null;
		} else if (index==0) {
			T rtnValue = header.getValue();
			return rtnValue;
		} else {
			LinkedListNode<T> currentNode = header;
			int currentIndex=1;
			while(currentIndex<index && currentNode.getNext()!=null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			if(currentIndex==index && currentNode.getNext()!=null) {
				LinkedListNode<T> nextNode = currentNode.getNext();
				T rtnValue = nextNode.getValue();
				return rtnValue;
			} else {
				return null;
			}
		}
	}
	
//	Inserts a value into the Linked List
	public int insert(T value, int index)throws Exception {
		if(index < 0) {
			throw new Exception("Out of Bounds");
		}
		if(index > size) {
			throw new Exception("Out of Bounds");
		}
		int currentIndex = 0;
		if(header == null) {
			header = new LinkedListNode<T>(value,null);
			}else if (index<=0) {
				header = new LinkedListNode<T>(value,header);
		}else {
			LinkedListNode<T> currentNode = header;
			currentIndex ++;
			while(currentIndex<index && currentNode.getNext()!= null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			LinkedListNode<T> insertedNode = new LinkedListNode<T>(value,currentNode.getNext());
			currentNode.setNext(insertedNode);
		}
		return currentIndex;
	}
	
//	Removes a value from the Linked List
	public T remove(int index)throws Exception {
		if(index < 0) {
			throw new Exception("Out of Bounds");
		}
		if(index > size) {
			throw new Exception("Out of Bounds");
		}
		if(header==null || index < 0) {
			return null;
		} else if (index==0) {
			T rtnValue = header.getValue();
			header = header.getNext();
			return rtnValue;
		} else {
			LinkedListNode<T> currentNode = header;
			int currentIndex = 1;
			while(currentIndex<index && currentNode.getNext()!=null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			if(currentIndex==index && currentNode.getNext()!=null) {
				LinkedListNode<T> nextNode = currentNode.getNext();
				T rtnValue = nextNode.getValue();
				currentNode.setNext(nextNode.getNext());
				return rtnValue;
			} else {
				return null;
			}
		}
	}
	public int add(T value) {
		LinkedListNode<T> currentNode = header;
		int counter = 0;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			counter++;
		}
		currentNode.setNext(new LinkedListNode<T>(value));	
		return counter;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public LinkedListNode<T> getHeader() {
		return header;
	}

	public void setHeader(LinkedListNode<T> header) {
		this.header = header;
	}
	
	private class LinkedListNode <T extends Comparable<T>> {
		
		private T value;
		private LinkedListNode<T> next;


		public LinkedListNode(T value) {
			this.value = value;
			this.next = null;
		}

		public LinkedListNode(T value, LinkedListNode<T> next) {
			this.value = value;
			this.next = next;
		}


		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public LinkedListNode<T> getNext() {
			return next;
		}

		public void setNext(LinkedListNode<T> next) {
			this.next = next;
		}

		}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public int add(T value) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

