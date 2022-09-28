package algoBlitz;

import java.util.HashMap;

public class RepeatedArray {

  public static void main(String[] args) {
    int[] testArray = {1, 1, 2, 2, 3, 3, 4, 4};
    int[] testArrayTwo = {1, 1, 3, 3, 4, 5, 6};
    
    System.out.println(elementsRepeated(testArray,2));
    System.out.println(elementsRepeated(testArrayTwo, 2));

  }
  
  static boolean elementsRepeated(int[] arr, int k){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < arr.length; i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
      }
      for(Integer x : map.keySet()){
        if(map.get(x) != k){
          return false;
        }
    } 
    return true;
  }
}
