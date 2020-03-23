package Arrays;

/*
 * How do you find the largest and smallest number in an unsorted integer array?
 */

public class ProblemThree {

	public static void main(String[] args) {
		int[] array = {9,1,2,3,4,743,468,34,45,8,7,9};
		int j, k;
		
		j = array[0];
		k = array[0];
		for (int i = 0; i < array.length; i++) {
			if(j > array[i]) {
				j = array[i];
			}
			else if (k < array[i]) {
				k = array[i];
			}
		}
		System.out.println("This is the lowest integer: "+j);
		System.out.println("This is the highest integet: " + k);
	
	}
}
