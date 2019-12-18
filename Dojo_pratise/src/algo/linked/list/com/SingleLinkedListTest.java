package algo.linked.list.com;

import java.util.stream.Stream;

public class SingleLinkedListTest {	
	public static void main(String[] args) {
		SinglyLinkedList slist=new SinglyLinkedList();
		slist.insertFront(9);
		slist.insertFront(0);
		slist.insertFront(7);
		slist.insertFront(5);
		
		slist.printAll();
		
		Stream<Integer> numStream = Stream.of(10, 20, 30);
		numStream.map(n -> n + 10).peek(s -> System.out.print(s));
		numStream.forEach(s -> System.out.println(s));
		

	}
}
