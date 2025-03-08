package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		// append 
		linkedList.append(3);
		linkedList.append(5);
		linkedList.append(6);
		linkedList.append(8);
		linkedList.append(10);
		linkedList.append(12);
		// add in begging of the linked list
		linkedList.prepend(2);
		// remove last item
		linkedList.removeLastItem();
		// remove specific item 
		linkedList.removeItem(1);
	    // get and set
		Node node = linkedList.getNodeByIndex(3);
		System.out.println("get node by index " + node.value);
		linkedList.insert(1, 4);
		// reverse
//		linkedList.reverse();
		// metadata 
		linkedList.getHead();
		linkedList.getHeadNext();
		linkedList.getTail();
		linkedList.getTailPrevious();
		linkedList.printList();
	}
}
