import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class LinkedListTests {
	DoubleLinkedList<Integer> emptyDoubleLinkedList;
	DoubleLinkedList<Integer> normalDoubleLinkedList;
	Integer []a = new Integer[] {10,15,20,25};
	ArrayList<Integer> testData = (ArrayList<Integer>) Arrays.asList(a);
	
	@Before
	public void setUp() throws Exception{
		emptyDoubleLinkedList = new DoubleLinkedList<Integer>();
		normalDoubleLinkedList = new DoubleLinkedList<Integer>(testData);
		testData = new ArrayList<Integer>();
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	

	@Test
	public void negatiVeIndex() throws Exception {
		LinkedList ll = new LinkedList();
		int expectedValue = 100;
		ll.insert(expectedValue, 0);
	}

	@Test
	public void tooBigIndex() throws Exception {
		LinkedList ll = new LinkedList();
		int expectedValue = 100;
		ll.insert(expectedValue, 0);
	}
	
	@Test
	public void CheckingDataStructure() {
		assertNotNull(emptyDoubleLinkedList);
	}
	@Test
	public void DoubleLinkedListTest() {
		DoubleLinkedList dll = new DoubleLinkedList();
		
	}
	public void addTest() throws Exception{
		
	}
	
	public void removeTest() throws Exception{
		
	}

}
