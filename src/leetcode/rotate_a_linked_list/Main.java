package leetcode.rotate_a_linked_list;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Question linkedList = new Question();

		int[] items = { 10, 20, 30, 40};
		Arrays.stream(items).forEach(item -> linkedList.append(item));

		linkedList.rotateaLinkedList(6);
		linkedList.printList();
//		System.out.println(linkedList.getLength());
	}
}
