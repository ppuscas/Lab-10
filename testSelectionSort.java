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

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		assertEquals ("should equal Sortedarr", selSortArr, Sortedarr);
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

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -9;
		Sortedarr[1] = -5;
		Sortedarr[2] = -4;
		Sortedarr[3] = -2;
		Sortedarr[4] = -1;
		assertEquals ("should equal Sortedarr", selSortArr, Sortedarr);
	}

	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -7;
		arr[1] = 8;
		arr[2] = 4;
		arr[3] = -4;
		arr[4] = 11;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -7;
		Sortedarr[1] = -4;
		Sortedarr[2] = 4;
		Sortedarr[3] = 8;
		Sortedarr[4] = 11;
	}

	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = -6;
		arr[2] = 6;
		arr[3] = 5;
		arr[4] = 0;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -6;
		Sortedarr[1] = 0;
		Sortedarr[2] = 5;
		Sortedarr[3] = 5;
		Sortedarr[4] = 6;
	}

}
