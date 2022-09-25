package algoBlitz;

import java.util.HashMap;

public class ElementsRepeated {

  public static void main(String[] args) {
    int[] testArrayOne = {1, 2, 3, 1, 2, 3};
    int[] testArrayTwo = {1, 2, 3, 1, 2, 3};
    int[] testArrayThree = {1, 3, 3, 5, 5, 5, 5, 5, 3};
    
    System.out.println(numElementsRepeatedX(testArrayOne, 2));
    System.out.println(numElementsRepeatedX(testArrayTwo, 3));
    System.out.println(numElementsRepeatedX(testArrayThree, 3));

  }
  
  static int numElementsRepeatedX(int[] arr, int x) {
    
    HashMap<Integer, Integer> elements = new HashMap<>();
    
    int count = 0;
    
    for(int i = 0; i < arr.length; i++) {
      if(elements.containsKey(arr[i])) {
        elements.put(arr[i], elements.get(arr[i]) + 1);
      } else {
        elements.put(arr[i], 1);
      }
    }
    
    for(Integer i : elements.values()) {
      if(i.equals(x)) {
        count++;
      }
    }
    
    return count;
  }

}
