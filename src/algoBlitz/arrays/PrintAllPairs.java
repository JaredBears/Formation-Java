package algoBlitz.arrays;

public class PrintAllPairs {
  public static void main(String[] args) {
    
    int[] testArrayOne = { };
    int[] testArrayTwo = {1, 2, 3};
    int[] testArrayThree = {1, 2, 3, 4};
    int[] testArrayFour = {1, 1};
    
    printAllPairs(testArrayOne);
    printAllPairs(testArrayTwo);
    printAllPairs(testArrayThree);
    printAllPairs(testArrayFour);
  }
  
  static void printAllPairs(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        System.out.println(arr[i] + ", " + arr[j]);
      }
    }
  }
}
