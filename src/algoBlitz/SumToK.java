package algoBlitz;

public class SumToK {

  public static void main(String[] args) {
    int[] testArrayOne = {1, 5, 8, 10, 13, 18};
    int[] testArrayTwo = {1, 5, 5, 11};
    int[] testArrayThree = {1, 7, 8};
    int[] testArrayFour = {1};
    int[] testArrayFive = { };
    
    int k = 15;
    int kTwo = 10;
    
    System.out.println(findAllPairsSumToK(testArrayOne, k));
    System.out.println(findAllPairsSumToK(testArrayTwo, k));
    System.out.println(findAllPairsSumToK(testArrayThree, k));
    System.out.println(findAllPairsSumToK(testArrayFour, k));
    System.out.println(findAllPairsSumToK(testArrayFive, k) + "\n");
    System.out.println(twoPointSumToK(testArrayOne, k));
    System.out.println(twoPointSumToK(testArrayTwo, k));
    System.out.println(twoPointSumToK(testArrayThree, k));
    System.out.println(twoPointSumToK(testArrayFour, k));
    System.out.println(twoPointSumToK(testArrayFive, k) + "\n");
    System.out.println(findAllPairsSumToK(testArrayOne, kTwo));
    System.out.println(findAllPairsSumToK(testArrayTwo, kTwo));
    System.out.println(findAllPairsSumToK(testArrayThree, kTwo));
    System.out.println(findAllPairsSumToK(testArrayFour, kTwo));
    System.out.println(findAllPairsSumToK(testArrayFive, kTwo) + "\n");
    System.out.println(twoPointSumToK(testArrayOne, kTwo));
    System.out.println(twoPointSumToK(testArrayTwo, kTwo));
    System.out.println(twoPointSumToK(testArrayThree, kTwo));
    System.out.println(twoPointSumToK(testArrayFour, kTwo));
    System.out.println(twoPointSumToK(testArrayFive, kTwo) + "\n");
  }
  
  static boolean findAllPairsSumToK(int[] arr, int k){
    
    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] + arr[j] == k) {
          return true;
        }
      }
    }
    
    return false;
  }
  
  static boolean twoPointSumToK(int[] arr, int k) {
    int i = 0;
    int j = arr.length - 1;
    
    while(i < j) {
      if(arr[i] + arr[j] > k) {
        j--;
      } else if(arr[i] + arr[j] < k) {
        i++;
      } else if (arr[i] + arr[j] == k) {
        return true;
      }
    }
    
    return false;
  }
}
