package algoBlitz;

import java.util.HashMap;

public class AllowedServings {
  public static void main(String[] args) {
    
    char[] testArrayOne = {};
    char[] testArrayTwo = {'J', 'B', 'L', 'J', 'C', 'D', 'J'};
    char[] testArrayThree = {'J', 'J'};
    char[] testArrayFour = {'A', 'B', 'C', 'D'};
    char[] testArrayFive = {'A', 'B', 'C'};
    
    System.out.println(limitedServings(testArrayOne, 0)); //=> False
    System.out.println(limitedServings(testArrayOne, 0)); //=> False
    System.out.println(limitedServings(testArrayTwo, 2));//  => True
    System.out.println(limitedServings(testArrayThree, 3)); //=> False
    System.out.println(limitedServings(testArrayFour, 1)); //=> False
    System.out.println(limitedServings(testArrayFive, 0)); //=> True
    }

  static boolean limitedServings(char[] patrons, int allowedServings){
    HashMap<Character, Integer> map = new HashMap<Character,Integer>();
    if(allowedServings == 0 && patrons.length > 0){
      return true;
    }
    for(int i = 0; i < patrons.length; i++){
      if(!map.containsKey(patrons[i])){
        map.put(patrons[i], 1);
      } else {
        map.put(patrons[i], map.get(patrons[i]) + 1);
      }
      if(map.get(patrons[i]) > allowedServings){
        return true;
      }
    }

    return false;
  }
}
