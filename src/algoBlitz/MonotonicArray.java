package algoBlitz;

public class MonotonicArray {

  public static void main(String[] args) {
    int[] testArrayOne = { };
    int[] testArrayTwo = {1, 1, 2};
    int[] testArrayThree = {1, 2, 3, 4, 5};
    int[] testArrayFour = {5, 4, 3, 2, 1};
    int[] testArrayFive = {5, 4, 7, 2, 1};
    
    System.out.println(isMonotonic(testArrayOne));
    System.out.println(isMonotonic(testArrayTwo));
    System.out.println(isMonotonic(testArrayThree));
    System.out.println(isMonotonic(testArrayFour));
    System.out.println(isMonotonic(testArrayFive));

  }
  
  static boolean isMonotonic(int[] arr) {
    
    boolean inc = true;
    boolean dec = true;
    
    if(arr.length <= 2) {
      return true;
    }
    
    for(int i = 1; i < arr.length; i++) {
      dec = dec && arr[i-1] >= arr[i];
      inc = inc && arr[i-1] <= arr[i];
      if(!dec && !inc) {
        return false;
      }
    }
    
    return true;
  }

}
