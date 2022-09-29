package algoBlitz;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] testArrayOne = {1, 2, 3, 4};
    int[] testArrayTwo = {1, 2};
    int[] testArrayThree = {};
    int[] testArrayFour = {1, 2, 3};

    rotateArray(testArrayOne, -1);
    rotateArray(testArrayTwo, 1);
    rotateArray(testArrayThree, 3);
    rotateArray(testArrayFour, 2);

    System.out.println(Arrays.toString(testArrayOne));
    System.out.println(Arrays.toString(testArrayTwo));
    System.out.println(Arrays.toString(testArrayThree));
    System.out.println(Arrays.toString(testArrayFour));
  }

  static void rotateArray(int[] arr, int k) {
    if(arr.length <= 1) {
      return;
    }
    if(k < 0) {
      k = arr.length - (Math.abs(k) % arr.length);
    } else {
      k = k % arr.length;
    }
    if(k == 0) {
      return;
    }
    reverseArray(arr, 0, arr.length);
    reverseArray(arr, 0, arr.length - k);
    reverseArray(arr, arr.length - k, arr.length);
  }

  static void reverseArray(int[] arr, int start, int end) {
    int i = start;
    int j = end - 1;

    while (i < j) {
      int swap = arr[i];
      arr[i] = arr[j];
      arr[j] = swap;
      i++;
      j--;
    }
  }

}
