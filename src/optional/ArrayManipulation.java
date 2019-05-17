package optional;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class ArrayManipulation {
	Random random = new Random();
	
//	@Test
//	public void testSortAnArray() throws Exception {
//
//		String[] testArray = { "concerned", "affected", "fascinated",
//				"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
//				"engrossed", "curious" };
//		Sorting.sort(testArray);
//		assertEquals("absorbed", testArray[0]);
//		assertEquals("affected", testArray[1]);
//		assertEquals("concerned", testArray[2]);
//		assertEquals("curious", testArray[3]);
//		assertEquals("engrossed", testArray[4]);
//		assertEquals("fascinated", testArray[5]);
//		assertEquals("snoopy", testArray[testArray.length - 1]);
//	}
//
//	@Test
//	public void testSortARandomArray() throws Exception {
//
//		String[] testArray = new String[100];
//		for (int i = 0; i < 100; ++ i) {
//			testArray[i] = Long.toString(random.nextLong());
//		}
//		
//		Sorting.sort(testArray);
//		for (int i = 0; i < 99; ++ i) {
//			assertTrue(testArray[i].compareTo(testArray[i+1]) <= 0);
//		}
//	}
//
//	@Test
//	public void testInsertIntoArray() {
//		int[] testArray = { 3, 6, 8, 3, 3, 2, 98 };
//		testArray = Inserting.insertAt(testArray, 5, 3);
//		assertEquals(3, testArray[0]);
//		assertEquals(3, testArray[4]);
//		assertEquals(3, testArray[5]);
//	}
//
//	@Test
//	public void testInsertIntoRandomArray() {
//		int[] testArray = new int[100];
//		for (int i = 0; i < 100; ++ i) {
//			testArray[i] = random.nextInt();
//		}
//		int[] inputArrayCopy = Arrays.copyOf(testArray, 100);
//		
//		int[] actualOutputArray = Inserting.insertAt(testArray, 73, 42);
//		assertEquals(42, actualOutputArray[73]);
//		for (int i = 0; i < 73; ++ i) {
//			assertEquals(inputArrayCopy[i], actualOutputArray[i]);
//		}
//		for (int i = 74; i < 101; ++ i) {
//			assertEquals(inputArrayCopy[i-1], actualOutputArray[i]);
//		}
//	}
//
//	@Test
//	public void testInsertInOrderFirst() throws Exception {
//		String[] orderedArray = { "concerned", "affected", "fascinated",
//				"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
//				"engrossed", "curious" };
//		Sorting.sort(orderedArray);
//
//		String[] outputArray =
//			Inserting.insertAlphabetically(orderedArray, "aardvark");
//		assertArrayEquals(
//			new String[] {
//				"aardvark",
//				"absorbed",
//				"affected",
//				"concerned",
//				"curious",
//				"engrossed",
//				"fascinated",
//				"inquisitive",
//				"intrigued",
//				"nosy",
//				"snoopy"
//			},
//			outputArray
//		);
//	}
//
//	@Test
//	public void testInsertInOrderMiddle() throws Exception {
//		String[] orderedArray = { "concerned", "affected", "fascinated",
//				"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
//				"engrossed", "curious" };
//		Sorting.sort(orderedArray);
//		
//		String[] outputArray =
//			Inserting.insertAlphabetically(orderedArray, "groovy");
//		assertArrayEquals(
//			new String[] {
//				"absorbed",
//				"affected",
//				"concerned",
//				"curious",
//				"engrossed",
//				"fascinated",
//				"groovy",
//				"inquisitive",
//				"intrigued",
//				"nosy",
//				"snoopy"
//			},
//			outputArray
//		);
//	}
//	
//	@Test
//	public void testInsertInOrderLast() throws Exception {
//		String[] orderedArray = { "concerned", "affected", "fascinated",
//				"intrigued", "absorbed", "inquisitive", "nosy", "snoopy",
//				"engrossed", "curious" };
//		Sorting.sort(orderedArray);
//		
//		String[] outputArray =
//			Inserting.insertAlphabetically(orderedArray, "zealous");
//		assertArrayEquals(
//			new String[] {
//				"absorbed",
//				"affected",
//				"concerned",
//				"curious",
//				"engrossed",
//				"fascinated",
//				"inquisitive",
//				"intrigued",
//				"nosy",
//				"snoopy",
//				"zealous"
//			},
//			outputArray
//		);
//	}
//	
//	@Test
//	public void testInsertInOrderWithRandomArray() throws Exception {
//		String[] orderedArray = new String[100];
//		for (int i = 0; i < 100; ++ i) {
//			orderedArray[i] = Long.toString(random.nextLong());
//		}
//		Sorting.sort(orderedArray);
//
//		String[] outputArray =
//			Inserting.insertAlphabetically(orderedArray, "groovy");
//		for (int i = 0; i < 100; ++ i) {
//			assertTrue(outputArray[i].compareTo(outputArray[i+1]) <= 0);
//		}
//	}

}


