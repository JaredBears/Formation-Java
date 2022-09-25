package algoBlitz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FellowsResumeReview {

  public static void main(String[] args) {
    Map<String, Integer> fellows = new HashMap<String, Integer>();
    fellows.put("Oliver", 3);
    fellows.put("Pinky", 1);
    fellows.put("Pixel", 2);
    fellows.put("Tobey", 1);
    
    Map<String, Integer> fellowsTwo = new HashMap<String, Integer>();
    fellowsTwo.put("Bonnie", 2);
    fellowsTwo.put("Clyde", 6);
    fellowsTwo.put("Jessie", 2);
    fellowsTwo.put("James", 7);
    fellowsTwo.put("Ralph", 1);
    
    System.out.println(earliestFellows(fellows).toString());
    System.out.println(earliestFellows(fellowsTwo).toString());
  }
  
  static List<String> earliestFellows(Map<String, Integer> fellows){
    List<String> earliestFellows = new ArrayList<String>();
    Integer earliest=-1;
    
    for(String fellow : fellows.keySet()) {
      Integer fellowTime = fellows.get(fellow);
      if(earliest == -1) {
        earliest = fellowTime;
        earliestFellows.add(fellow);
      } else if(earliest == fellowTime) {
        earliestFellows.add(fellow);
      } else if(earliest > fellowTime) {
        earliest = fellowTime;
        earliestFellows.clear();
        earliestFellows.add(fellow);
      }
    };
    
    
    return earliestFellows;
  }

}
