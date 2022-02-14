
public class Node implements LinkedListNode {

	private Object object;
	public Node next;
		
	public Node(Object object, Node node) {		
		this.object = object;
		this.next = node;
	}
	
	public Node(Object object) {		
		this.object = object;
		this.next = null;
	}
			
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "Node [object=" + object + ", node=" + next + "]";
	}
	
	
	
}
