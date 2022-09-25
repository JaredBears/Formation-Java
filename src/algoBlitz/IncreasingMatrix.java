package algoBlitz;

import java.util.ArrayList;

public class IncreasingMatrix {

  public static void main(String[] args) {
    System.out.println(generateSequence(5).toString());
    System.out.println(generateSequence(0).toString());
    System.out.println(generateSequence(10).toString());

  }
  
  static ArrayList<ArrayList<Integer>> generateSequence(int n){
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    
    for(int i = 1; i <= n; i++) {
      ArrayList<Integer> level = new ArrayList<>();
      for(int j = 1; j <= i; j++) {
        level.add(j);
      }
      result.add(level);
    }
    
    return result;
  }

}
