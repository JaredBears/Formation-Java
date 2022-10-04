package algoBlitz;

import java.util.HashMap;

public class StringToInt {
  static HashMap<String, Integer> map = new HashMap<>();

  

  public static void main(String[] args) {
    map.put("1", 1);
    map.put("2", 2);
    map.put("3", 3);
    map.put("4", 4);
    map.put("5", 5);
    map.put("6", 6);
    map.put("7", 7);
    map.put("8", 8);
    map.put("9", 9);
    map.put("10", 10);
    
    System.out.println(stringToIntRecursive("-123"));
    System.out.println(stringToIntIterative("-478"));
    
  }
  
  static int stringToIntRecursive(String str){
    if(str.length() == 0) {
      return 0;
    }
    Boolean negative = str.charAt(0) == '-';
    if(negative) {
      return stringToIntRecursive(str, 1, 0) * -1;
    } else {
      return stringToIntRecursive(str, 0, 0);
    }
  }
  static int stringToIntRecursive(String str, int start, int value) {
    if(str.length() <= start) {
      return value;
    }
    
    value = value * 10 + map.get(String.valueOf(str.charAt(start)));
    
    return stringToIntRecursive(str, start +1 , value);
  }
  
  static int stringToIntIterative(String str) {
    if(str.length() == 0) {
      return 0;
    }
    
    int value = 0;
    for(int i = 1; i < str.length(); i++) {
      value = value * 10 + map.get(String.valueOf(str.charAt(i)));
    }
    if(str.charAt(0) == '-') {
      value *= -1;
    }
    return value;
  }

}
