package algoBlitz;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] testArrayOne = {1, 2, 3, 4, 5};
    int[] testArrayTwo = {4, 3, 2, 1};
    int[] testArrayThree = {};
    int[] testArrayFour = {1};


    System.out.println(Arrays.toString(reverseArray(testArrayOne)));
    System.out.println(Arrays.toString(reverseArray(testArrayTwo)));
    System.out.println(Arrays.toString(reverseArray(testArrayThree)));
    System.out.println(Arrays.toString(reverseArray(testArrayFour)));
  }

  static int[] reverseArray(int[] arr) {
    int i = 0;
    int j = arr.length - 1;

    while (i <= j) {
      int swap = arr[i];
      arr[i] = arr[j];
      arr[j] = swap;
      i++;
      j--;
    }

    return arr;
  }
}
