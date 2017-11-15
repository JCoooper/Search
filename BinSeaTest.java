import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinSeaTest {

	@Test
	public void testBinarySearch() {

		// int[] sort = { 2, 3, 6, 7};
		int[] test1 = { 13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8 };
		QuickSort.quicksort(test1, 0, 14);
		// BinSea.binarySearch(test1, 0, 3);
		assertEquals(0, BinSea.binarySearch(test1, 0, 14, 1));
	}
}