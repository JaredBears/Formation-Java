package algoBlitz.arrays;

public class BasicArrayIteration {
  
  public static void main(String[] args) {
    int[] testData = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int k=3;
    
    printArray(testData);
    printEveryOtherValue(testData);
    printEveryOtherValueSkipFirst(testData);
    printEveryKth(testData, k);
    printReverse(testData);
    printReverseEveryOtherValue(testData);
    printReverseEveryOtherValueSkipLast(testData);
    printReverseEveryKth(testData, k);
  }

  static void printArray(int[] arr){
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  static void printEveryOtherValue(int[] arr){
    for(int i = 0; i < arr.length; i+=2) {
      System.out.println(arr[i]);
    }
  }
  static void printEveryOtherValueSkipFirst(int[] arr){
    for(int i = 1; i < arr.length; i+=2) {
      System.out.println(arr[i]);
    }
  }
  static void printEveryKth(int[] arr, int k){
    for(int i = 0; i < arr.length; i+=k) {
      System.out.println(arr[i]);
    }
  }
  static void printReverse(int[] arr){
    for(int i = arr.length-1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
  static void printReverseEveryOtherValue(int[] arr){
    for(int i = arr.length-1; i >= 0; i-=2) {
      System.out.println(arr[i]);
    }
  }
  static void printReverseEveryOtherValueSkipLast(int[] arr){
    for(int i = arr.length-2; i >= 0; i-=2) {
      System.out.println(arr[i]);
    }
  }
  static void printReverseEveryKth(int[] arr, int k){
    for(int i = arr.length-1; i >= 0; i-=k) {
      System.out.println(arr[i]);
    }
  }
  
}
