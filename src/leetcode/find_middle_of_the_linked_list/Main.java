package leetcode.find_middle_of_the_linked_list;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Question linkedList = new Question();
		
		int[] items = {2, 3, 4, 5, 6, 7};
		Arrays.stream(items).forEach(item -> linkedList.append(item));
		
		System.out.println(linkedList.findTheMiddle());
		
	}
}
