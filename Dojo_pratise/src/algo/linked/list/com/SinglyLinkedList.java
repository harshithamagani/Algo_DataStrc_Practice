package algo.linked.list.com;

public class SinglyLinkedList {
	private Node head;
	
	public SinglyLinkedList(){
		head = null;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insertFront(int value) {
		Node currentNode = head;
		Node newNode = new Node(value);
		if(head != null) {
			while(currentNode.getNext()!= null) {
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(newNode);
			return true;
			
		} else {
			head = newNode;
			return true;
		}
	}
	
	public void printAll() {
		Node currentNode = head;
		while(currentNode!= null) {
			System.out.println(currentNode.getValue());
			currentNode=currentNode.getNext();
		}
	}
	
}
