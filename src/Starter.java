import java.util.Scanner;

public class Starter {

	public static void main(String []args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What size queue do you want?");
		int size = scan.nextInt();
		
		System.out.println("How many producer threads do you want?");
		int producerThreads = scan.nextInt();
		
		System.out.println("How many consumer threads do you want?");
		int consumerThreads = scan.nextInt();
		
		System.out.println("How many seconds do you want to wait until each item is produced ");
		int delayedProducer = scan.nextInt();
		
		System.out.println("How many seconds do you want to wait until each item is consumed ");
		int delayedConsumer = scan.nextInt();
		
		
		
		
		Queue<Integer> q =  new Queue<>(0);
		q.setMAXSIZE(size);
		q.pop();
		
		
//		Consumer
		new Thread() {
		    public void run() {
		    	if(q.getSize()<= 0) {
		    		System.out.println("null");
		    	}else {
		    		System.out.println(q.pop());
		    	}
	
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		    }
		}.start();
		
		
//		Producer
	
		new Thread() {
		    public void run() {
		    	if(q.getSize()>= q.MAXSIZE) {
		    		System.out.println("Producer is waiting");
		    	} else {
		    		q.push((int)(Math.random()*10));
		    	}
		   
		       try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   }
		}.start();



		LinkedList ll = new LinkedList();


		ll.insert(100,0);
		System.out.println(ll.toString());
		ll.insert(150,0);
		System.out.println(ll.toString());
		ll.insert(200,0);
		System.out.println(ll.toString());
		ll.insert(250,0);
		System.out.println(ll.toString());

		ll.add(780);
		ll.add(800);

		ll.remove(0);
		System.out.println(ll.toString());
		ll.remove(0);
		System.out.println(ll.toString());
		ll.remove(0);
		System.out.println(ll.toString());
		ll.remove(0);
		System.out.println(ll.toString());


		DoubleLinkedList dll = new DoubleLinkedList();
		dll.add(6);
		System.out.println(dll.toString());
		dll.add(8);
		System.out.println(dll.toString());
		dll.add(12);
		System.out.println(dll.toString());

		SortedLinkedList sll = new SortedLinkedList();

		sll.add(5);
		System.out.println(sll.toString());
		sll.add(8);
		System.out.println(sll.toString());
		sll.add(2);
		System.out.println(sll.toString());
		sll.add(-6);
		System.out.println(sll.toString());


		Stack stack = new Stack(0);
		stack.top();
		stack.pop();
		stack.push(250);

		Queue queue =  new Queue(0);
		queue.top();
		queue.pop();
		queue.push(250);

	}

}
