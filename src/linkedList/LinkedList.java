package linkedList;

public class LinkedList{

	protected Node head;
	protected Node tail;
	private int length;

//	public LinkedList(int value) {
//		Node newNode = new Node(value);
//		head = newNode;
//		tail = newNode;
//		length = 1;
//	}

	public void append(int vlaue) {
		Node newNode = new Node(vlaue);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			Node tempTail = tail;
			tempTail.next = newNode;
			newNode.previous = tempTail;
			tail = newNode;
			length++;
		}

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
		length++;
	}

	public Node getNodeByIndex(int index) {
		if (index < 0 || index >= length) {
			return null;
		}

		Node tempNode = head;
		int count = 0;
		while (tempNode != null) {
			if (count == index) {
				return tempNode;
			}
			tempNode = tempNode.next;
			count++;
		}
		return null;
	}

	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			return;
		}

		if (index == 0) {
			prepend(value);
		} else if (index == length) {
			append(value);
		} else {
			Node newNode = new Node(value);
			Node node = getNodeByIndex(index);
			if (node != null) {
				newNode.previous = node.previous;
				newNode.next = node;
				node.previous.next = newNode;
				node.previous = newNode;
				length++;
			}
		}
	}

	public void reverse() {
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			prev = temp.previous;
			temp.previous = temp.next;
			temp.next = prev;
			temp = temp.previous;
		}
		if (prev != null) {
			head = prev.previous;
			tail = prev.next;
		}
	}

	public void removeLastItem() {
		Node previousNode = tail.previous;
		previousNode.next = null;
		Node temp = tail;
		tail = previousNode;
		length--;

		System.out.println("Last item " + temp.value + " is deleted successfully");
	}

	public void removeItem(int value) {
		if (head == null) {
			System.out.println("List is empty. No item to delete.");
			return;
		}

		if (value == tail.value) {
			removeLastItem();
			return;
		}

		Node temp = head;
		while (temp != null) {
			if (temp.value == value) {
				if (temp == head) {
					// if the node to remove is the head
					head = head.next;
					if (head != null) {
						head.previous = null;
					}
				} else {
					temp.previous.next = temp.next;
				}

				if (temp.next != null) {
					temp.next.previous = temp.previous;
				}

				length--;
				System.out.println("Item " + value + " deleted successfully.");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Item " + value + " not found.");
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public Node getHead() {
		return head;
	}

	public void getHeadNext() {
		System.out.println("Head Next " + head.next.value);
	}

	public Node getTail() {
		return tail;
	}

	public void getTailPrevious() {
		System.out.println("Tail Previous " + tail.previous.value);
	}

	public int getLength() {
		return length;
	}
	

}
