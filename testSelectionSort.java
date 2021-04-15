import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		SelectionSort temp1 = new SelectionSort();
		int[] selSortArr = temp1.basicSelectionSort(arr);

		int[] sortedArr = new int[5];
		sortedArr[0] = 2;
		sortedArr[1] = 7;
		sortedArr[2] = 8;
		sortedArr[3] = 9;
		sortedArr[4] = 10;

		assertArrayEquals ("should equal Sortedarr", selSortArr, sortedArr);
	}

	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -2;
		arr[1] = -9;
		arr[2] = -5;
		arr[3] = -4;
		arr[4] = -1;

		SelectionSort temp1 = new SelectionSort();
		int[] selSortArr = temp1.basicSelectionSort(arr);

		int[] sortedArr = new int[5];
		sortedArr[0] = -9;
		sortedArr[1] = -5;
		sortedArr[2] = -4;
		sortedArr[3] = -2;
		sortedArr[4] = -1;
		assertArrayEquals ("should equal Sortedarr", selSortArr, sortedArr);
	}

	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -7;
		arr[1] = 8;
		arr[2] = 4;
		arr[3] = -4;
		arr[4] = 11;

		SelectionSort temp1 = new SelectionSort();
		int[] selSortArr = temp1.basicSelectionSort(arr);

		int[] sortedArr = new int[5];
		sortedArr[0] = -7;
		sortedArr[1] = -4;
		sortedArr[2] = 4;
		sortedArr[3] = 8;
		sortedArr[4] = 11;

		assertArrayEquals("should equal Sortedarr", selSortArr, sortedArr);
	}

	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = -6;
		arr[2] = 6;
		arr[3] = 5;
		arr[4] = 0;

		SelectionSort temp1 = new SelectionSort();
		int[] selSortArr = temp1.basicSelectionSort(arr);

		int[] sortedArr = new int[5];
		sortedArr[0] = -6;
		sortedArr[1] = 0;
		sortedArr[2] = 5;
		sortedArr[3] = 5;
		sortedArr[4] = 6;

		assertArrayEquals("should equal Sortedarr", selSortArr, sortedArr);
	}

}
