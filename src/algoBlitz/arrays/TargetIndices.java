package algoBlitz.arrays;

import java.util.Arrays;

public class TargetIndices {

  public static void main(String[] args) {
    int[] testArrayOne = { };
    int[] testArrayTwo = {30};
    int[] testArrayThree = {40};
    int[] testArrayFour = {30, 40, 50};
    int[] testArrayFive = {30, 40, 30};
    int[] testArraySix = {30, 30, 30};
    
    int target = 30;
    
    System.out.println(Arrays.toString(indicesOfTarget(testArrayOne, target)));
    System.out.println(Arrays.toString(indicesOfTarget(testArrayTwo, target)));
    System.out.println(Arrays.toString(indicesOfTarget(testArrayThree, target)));
    System.out.println(Arrays.toString(indicesOfTarget(testArrayFour, target)));
    System.out.println(Arrays.toString(indicesOfTarget(testArrayFive, target)));
    System.out.println(Arrays.toString(indicesOfTarget(testArraySix, target)));
  }
  
  static int[] indicesOfTarget(int[] arr, int x) {
    int[] results = new int[arr.length];
    int resultIndex = 0;
    
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == x) {
        results[resultIndex] = i;
        resultIndex ++;
      }
    }
    
    return Arrays.copyOfRange(results, 0, resultIndex);
  }

}
