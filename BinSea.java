public class BinSea {
	public static int binarySearch(int[] arr, int left, int right, int x) {
		if (left <= right) {
			int mid = left + (right - 1) / 2;
			if (x == arr[mid]) {
				return mid;
			} else if (x < arr[mid]) {
				return binarySearch(arr, left, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, right, x);
			}

		} else {
			return -1;
		}

	}
}
