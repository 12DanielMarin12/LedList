
public class List implements LinkedList {
	
	Node head;
	Node tail;
	
	public List() {
		this.head = null;
		this.tail = null;	
	}
	
	public List(Object object) {
		this.head = new Node(object);
		this.tail = head;
	}

	@Override
	public boolean add(Object object) {
		try {
			if(isEmpty()) {
				this.head = new Node(object);
				this.tail = head;
			} else {
				this.tail.next = new Node(object);
				this.tail = this.tail.next;
			}
			return true;
		} catch (Exception e) {
			return false;
		}		
		
	}

	@Override
	public boolean add(LinkedListNode node, Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Object objects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(LinkedListNode node, Object objects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addFirst(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addLast(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LinkedList clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Object objects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedListNode nodeOf(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEquals(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {		
		return head == null;
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(LinkedListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrevious(LinkedListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNext(LinkedListNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(LinkedListNode node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Object objects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Object objects) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set(LinkedListNode node, Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LinkedList subList(LinkedListNode from, LinkedListNode to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "List [head=" + head + ", tail=" + tail + "]";
	}
	
	

}
