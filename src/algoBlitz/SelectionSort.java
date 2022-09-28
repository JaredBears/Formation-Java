package algoBlitz;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] testArray = {1, 9, 5, 12, 7, 86, 21, 4};
    int[] testArrayTwo = {5, 7, 4, 2, 1, -4, 9};

    System.out.println(Arrays.toString(selectionSort(testArray)));
    System.out.println(Arrays.toString(selectionSort(testArrayTwo)));
  }

  static int[] selectionSort(int[] arr) {
    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    int startIndex = 0;
    int endIndex = arr.length - 1;
    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] < min) {
        min = arr[i];
        minIndex = i;
      }
      if (i == arr.length - 1) {
        int temp = arr[startIndex];
        arr[startIndex] = min;
        arr[minIndex] = temp;
        i = startIndex;
        startIndex++;
        min = Integer.MAX_VALUE;
      }
    }
    return arr;
  }
}
