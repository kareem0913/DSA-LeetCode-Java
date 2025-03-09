package leetcode.rotate_a_linked_list;

import linkedList.LinkedList;
import linkedList.Node;

public class Question extends LinkedList {

	public void rotateaLinkedList(int k) {
		int length = getLength();
		if (k <= 0 || length == 0 || k % length == 0) {
			return;
		}

		// handle cases where k > length
		k = k % length;

		for (int i = 0; i < k; i++) {
			Node oldHead = head;
			Node newHead = head.next;

			// update new head
			newHead.previous = null;
			head = newHead;

			// move old head to tail
			tail.next = oldHead;
			oldHead.previous = tail;
			oldHead.next = null;
			tail = oldHead;
		}
	}
}
