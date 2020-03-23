package LinkedList;

import java.util.LinkedList;

/*
 * How do you find the middle element of a singly linked list in one pass?
 */

public class ProblemEleven {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);
		
		int sPointer = 0;
		int i = 0;
		try {
			while(list.get(i) != null) {
				System.out.println(list.get(i));
				i++;
				if (i%2 == 1) {
					sPointer++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("This is the middle number: " + sPointer);
		}
	}
}
