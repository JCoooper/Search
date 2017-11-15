class QuickSort {

	static void quicksort(int arr[], int lo, int hi) {
		if (lo < hi) {
			int par = partition(arr, lo, hi);
			quicksort(arr, lo, par - 1);
			quicksort(arr, par + 1, hi);
		}
	}

	static int partition(int arr[], int lo, int hi) {
		int pivot = arr[hi];
		int i = (lo - 1);
		for (int j = lo; j < hi; j++) {
			if (arr[j] <= pivot) {
				i++;

				int v = arr[i];
				arr[i] = arr[j];
				arr[j] = v;
			}
		}

		int v = arr[i + 1];
		arr[i + 1] = arr[hi];
		arr[hi] = v;

		return i + 1;
	}

}
