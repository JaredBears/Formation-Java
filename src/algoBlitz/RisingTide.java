package algoBlitz;

import java.util.HashMap;
import java.util.Map;

public class RisingTide {

  public static void main(String[] args) {
    String[] fellowsOne = {"oliver", "pixel", "pinky", "pixel", "pinky"};
    String[] fellowsTwo = {"pinky", "pixel", "pinky", "oliver"};
    
    System.out.println(risingTideWinner(fellowsOne));
    System.out.println(risingTideWinner(fellowsTwo));

  }
  
  static String risingTideWinner(String[] arr) {
    Map<String, Integer> nominations = new HashMap<String, Integer>();
    String winner = "";
    int maxValue = 0;
    
    for(String student : arr) {
      if(nominations.containsKey(student)) {
        nominations.put(student, nominations.get(student)+1);
      } else {
        nominations.put(student, 1);
      }
      
      if(nominations.get(student) > maxValue) {
        winner = student;
        maxValue = nominations.get(student);
      }
    }
    
    return winner;
  }

}
