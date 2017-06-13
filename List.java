public class List {
	private Node head;
	
	List(){
		head = null;
	}
	
	public void add(Object o){
		Node element = new Node();
		element.data = o;
		element.next = null;
		if(head == null){
			head = element;
		}
		else{
			Node step = head;
			while(step.next != null){
				step = step.next;
			}
			step.next = element;
		}
	}
	
	public void traverseAndApply(ActionObject ao){
		for(Node current = head; current!=null; current=current.next) ao.action(current);
	}
}
