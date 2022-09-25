package algoBlitz;

import java.util.HashMap;
import java.util.HashSet;

public class MatchFellows {

  public static void main(String[] args) {
    HashMap<String, Integer> fellows = new HashMap<>();
    fellows.put("Oliver", 3);
    fellows.put("Pixel", 3);
    fellows.put("Pinky", 5);
    fellows.put("Tobey", 5);
    
    HashMap<String, Integer> fellowsTwo = new HashMap<>();
    fellowsTwo.put("Oliver", 3);
    fellowsTwo.put("Pixel", 4);
    fellowsTwo.put("Pinky", 5);
    fellowsTwo.put("Tobey", 5);
    
    HashMap<String, Integer> fellowsThree = new HashMap<>();
    
    HashMap<String, Integer> fellowsFour = new HashMap<>();
    fellowsFour.put("Oliver", 3);
    fellowsFour.put("Pixel", 3);
    fellowsFour.put("Pinky", 5);
    
    System.out.println(canMatchFellows(fellows));
    System.out.println(canMatchFellows(fellowsTwo));
    System.out.println(canMatchFellows(fellowsThree));
    System.out.println(canMatchFellows(fellowsFour));

  }
  
  static boolean canMatchFellows(HashMap<String, Integer> fellows) {
    HashSet<Integer> set = new HashSet<>();
    
    fellows.forEach((key, value) -> {
      if(set.contains(value)) {
        set.remove(value);
      } else {
        set.add(value);
      }
    });
    return set.isEmpty();
  }

}
