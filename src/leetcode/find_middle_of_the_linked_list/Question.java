package leetcode.find_middle_of_the_linked_list;

import linkedList.LinkedList;
import linkedList.Node;

public class Question extends LinkedList {
	
	public int findTheMiddle() {
		int middle =  (int) Math.ceil((getLength() - 1) / 2.0);
		
		Node node = getNodeByIndex(middle);
		if (node != null) {
			return node.value;
		}
		return 0;
	}
	
	
	
	
}
