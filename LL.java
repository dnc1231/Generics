package generics;

public class LL<T> {
	
	private LLN<T> head;
	
	public LL(LLN<T> newHead) {
		head = newHead;
	}
	
	public void insert(T object) {
		LLN<T> node = new LLN<T> (object);
		if (head == null) {
			head = node;
		}else {
			LLN<T> nextNode = head;
			while (nextNode.hasNext()) {
				nextNode = nextNode.getNext();
			}
			nextNode.setNext(node);
		}
	}
	
	public void remove() {
		LLN<T> nextNode = head;
		if (head == null) {
			return;
		}else{
			LLN<T> prev = nextNode;
			while (nextNode.hasNext()) {
				prev = nextNode;
				nextNode = nextNode.getNext();
			}
			prev.setNext(nextNode.getNext());
		}
	}
	
	public void printList() {
		LLN<T> nextNode = head;
		if (head == null) {
			return;
		}else {
			while (nextNode != null) {
				System.out.print(nextNode.toString() + " ");
				nextNode = nextNode.getNext();
			}
		}
	}
}
