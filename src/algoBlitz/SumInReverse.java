package algoBlitz;

import java.util.Arrays;

public class SumInReverse {
  
  public static void main(String[] args) {
    int[] testArrayOne = {1, 2, 3};
    int[] testArrayTwo = {4, 6, 10};
    int[] testArrayThree = {1, 5, 10, 12};
    int[] testArrayFour = {2, 4, 3, 5};
    
    System.out.println(Arrays.toString(sumInReverse(testArrayOne, testArrayTwo)));
    System.out.println(Arrays.toString(sumInReverse(testArrayThree, testArrayFour)));
  }
  
  static int[] sumInReverse(int[] arrOne, int[] arrTwo) {
    int[] result = new int[arrOne.length];
    
    for(int i = 0; i < arrOne.length; i ++) {
      result[i] = arrOne[i] + arrTwo[(arrTwo.length - 1) - i];
    }
    
    return result;
  }

}
