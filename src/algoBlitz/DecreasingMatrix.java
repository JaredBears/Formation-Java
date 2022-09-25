package algoBlitz;

import java.util.ArrayList;

public class DecreasingMatrix {

  public static void main(String[] args) {
    System.out.println(generateSequence(5).toString());
    System.out.println(generateSequence(0).toString());
    System.out.println(generateSequence(10).toString());

  }
  
  static ArrayList<ArrayList<Integer>> generateSequence(int n){
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    
    for(int i = n; i > 0; i--) {
      ArrayList<Integer> level = new ArrayList<>();
      for(int j = i; j > 0; j--) {
        level.add(j);
      }
      result.add(level);
    }
    
    return result;
  }

}
