import java.util.ArrayList;
public abstract class OrderedDataStructure<T> implements Iterable<T> {
	private int index;
	private T value;
	private int size;
	
	
	public ArrayList<T> toArrayList(){
		ArrayList<T> arrayList = new ArrayList<T>();
		for(T item: this) {
			arrayList.add(item);
		}
		return arrayList;	
		}
		
	
	public String toString() {
		String array = "";
		for(T string:this) {
			array += string;
		}
		return array;
	}
		
	public int getSize() {
		return size;
	}


	public abstract T get(int index)throws Exception;
	
	public abstract int add(T value);
		
	
	public OrderedDataStructure() {
		size = 0;
	}
	
	public OrderedDataStructure(ArrayList<T> value) {
		for(int i =0; i<value.size(); i++) {
			this.add(value.get(i));
		}
	}

}
