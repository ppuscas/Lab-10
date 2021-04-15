public class SelectionSort {
		private int temp;
		private int minIndex;

	public SelectionSort() {
	}

	public int[] basicSelectionSort(int[] x) {

		int n = x.length;

        for (int i = 0; i < n-1; i++)
        {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (x[j] < x[minIndex]) {
                	minIndex = j;
                }
            }

            temp = x[minIndex];
            x[minIndex] = x[i];
            x[i] = temp;
        }
		return x;
	}
}
