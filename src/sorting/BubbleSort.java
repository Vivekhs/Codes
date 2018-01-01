/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivekrjt
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.print("Enter elments: ");

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		array = bubbleSort(array, size);

		System.out.println(Arrays.toString(array));

	}

	private static int[] bubbleSort(int[] array, int size) {
		
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				
				if (array[j] > array[j + 1]) {
					
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];

				}
			}
		}
		
		return array;
	}

}
