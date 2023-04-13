import java.util.ArrayList;
import java.util.Iterator;

public class DoubleLinkedList<T extends Comparable<T>> extends OrderedDataStructure implements Iterator<T> {
	
	private T value;
	private DoubleLinkedList<T> next;
	private DoubleLinkedList<T> prev;
	private int size;
	private DoubleLinkedListNode<T> header;
	private DoubleLinkedListNode<T> tail;
	
	
	public DoubleLinkedList(){
		super();
		header = null;
		size = 0;
	}
//	Constructor that is the child class for the super class
	public DoubleLinkedList(ArrayList<T> value) {
		super();
	}
	
	
//	public String toString() {
//		if(header == null) {
//			return "List is Empty";
//		}else {
//			String rtn = " ";
//			DoubleLinkedListNode<T> current = header;
//			while(current!=null) {
//				rtn += current.getValue()+ " , ";
//				current = current.getNext();
//			}
//			return rtn;
//		}
//	}
	
//	private String toStringRecursion(DoubleLinkedListNode<T> current) {
//		if(current.getNext() == null) {
//            return current.getValue().toString();
//        } else {
//            return current.getValue().toString() + ", " + toStringRecursion(current.getNext());
//        }
//	}
	
	public int getSize(int value) {
		int count = 0;
		DoubleLinkedListNode<T> currentNode = header;
		while(currentNode != null) {
			count ++;
			currentNode = currentNode.getNext();
		}
		return value;
	}
	
	
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
			DoubleLinkedListNode<T> currentNode = header;
			int currentIndex=1;
			while(currentIndex<index && currentNode.getNext()!=null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			if(currentIndex==index && currentNode.getNext()!=null) {
				DoubleLinkedListNode<T> nextNode = currentNode.getNext();
				T rtnValue = nextNode.getValue();
				return rtnValue;
			} else {
				return null;
			}
		}
	}
	
	public int insert(T value, int index)throws Exception {
		if(index < 0) {
			throw new Exception("Out of Bounds");
		}
		if(index > size) {
			throw new Exception("Out of Bounds");
		}
		int currentIndex = 0;
		if(header == null) {
			header = new DoubleLinkedListNode<T>(value,null);
			}else if (index<=0) {
				header = new DoubleLinkedListNode<T>(value,header);
		}else {
			DoubleLinkedListNode<T> currentNode = header;
			currentIndex ++;
			while(currentIndex<index && currentNode.getNext()!= null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			DoubleLinkedListNode<T> insertedNode = new DoubleLinkedListNode<T>(value,currentNode.getNext());
			currentNode.setNext(insertedNode);
		}
		return currentIndex;
	}
	
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
			DoubleLinkedListNode<T> currentNode = header;
			int currentIndex = 1;
			while(currentIndex<index && currentNode.getNext()!=null) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			if(currentIndex==index && currentNode.getNext()!=null) {
				DoubleLinkedListNode<T> nextNode = currentNode.getNext();
				T rtnValue = nextNode.getValue();
				currentNode.setNext(nextNode.getNext());
				return rtnValue;
			} else {
				return null;
			}
		}
	}
	
	public int add(T value) {
		DoubleLinkedListNode<T> currentNode = header;
		if(header == null) {
			header = new DoubleLinkedListNode<T>(value);
			return 0;
		}
		int counter = 0;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			counter++;
		}
		currentNode.setNext(new DoubleLinkedListNode<T>(value));	
		return counter;
	}
	
	
	public void push(T value) {
		if(header == null) {
			header  = new DoubleLinkedListNode<T>(value, null);
		}else {
			header  = new DoubleLinkedListNode<T>(value, header);
		}
	}
	
	public T pop() {
		if(header==null) {
			return null;
		} else {
			T currentValue = header.getValue();
			header = header.getNext();
			return currentValue;
		}
	}
	
	public T top() {
		if(header==null) {
			return null; 
		} else {
			T currentValue = header.getValue();
			return currentValue;
		}
	}
	public DoubleLinkedList<T> getNext() {
		return next;
	}

	public void setNext(DoubleLinkedList<T> next) {
		this.next = next;
	}

	public DoubleLinkedList<T> getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinkedList<T> prev) {
		this.prev = prev;
	}

	

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleLinkedListNode<T> getHeader() {
		return header;
	}

	public void setHeader(DoubleLinkedListNode<T> header) {
		this.header = header;
	}
	
	private class DoubleLinkedListNode <T> {
		
		private T value;
		private DoubleLinkedListNode<T> next;
		private DoubleLinkedListNode<T> prev;

		
		public DoubleLinkedListNode(T value) {
			this.value = value;
			this.next = null;
		}
	
		
		public DoubleLinkedListNode<T> getPrev() {
			return prev;
		}
		
		public DoubleLinkedListNode<T> getNext(){
			return next;
		}


		public void setPrev(DoubleLinkedListNode<T> prev) {
			this.prev = prev;
		}


		public void setNext(DoubleLinkedListNode<T> next) {
			this.next = next;
		}


		public DoubleLinkedListNode(T value, DoubleLinkedListNode<T> next) {
			this.value = value;
			this.next = next;
		}
		

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}


	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int add(Object value) {
		// TODO Auto-generated method stub
		return 0;
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



}
