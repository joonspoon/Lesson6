package examples;

import java.util.Arrays;

public class OldSchoolArrays {

	public static void main(String[] args) {

		// make an array of ints
		int[] numbers = { 1, 5, 7, 7, 24, 4 };
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		

		// add my name to an array
		
		char[] nameArray = new char[4];
		nameArray[0] = 'J';
		nameArray[1] = 'u';
		
		nameArray = "June".toCharArray();
		
		System.out.println(Arrays.toString(nameArray));

	}

}
