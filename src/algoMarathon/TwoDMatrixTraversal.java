package algoMarathon;

import java.util.ArrayList;

public class TwoDMatrixTraversal {

  public static void main(String[] args) {
    int[][] testOne = {{}};
    int[][] testTwo = {{1,2,3},{4,5,6}};
    int[][] testThree = {{1,2,3,4}};
    int[][] testFour = {{1},{2},{3}};
    int[][] testFive = {{1,2},{3,4}};
    
    System.out.println(rowTraversal(testOne));
    System.out.println(rowTraversal(testTwo));
    System.out.println(rowTraversal(testThree));
    System.out.println(rowTraversal(testFour));
    System.out.println(rowTraversal(testFive));
    System.out.println("");
    System.out.println(columnTraversal(testOne));
    System.out.println(columnTraversal(testTwo));
    System.out.println(columnTraversal(testThree));
    System.out.println(columnTraversal(testFour));
    System.out.println(columnTraversal(testFive));
    System.out.println("");
    System.out.println(reverseRowTraversal(testOne));
    System.out.println(reverseRowTraversal(testTwo));
    System.out.println(reverseRowTraversal(testThree));
    System.out.println(reverseRowTraversal(testFour));
    System.out.println(reverseRowTraversal(testFive));
    System.out.println("");
    System.out.println(reverseColumnTraversal(testOne));
    System.out.println(reverseColumnTraversal(testTwo));
    System.out.println(reverseColumnTraversal(testThree));
    System.out.println(reverseColumnTraversal(testFour));
    System.out.println(reverseColumnTraversal(testFive));
    System.out.println("");
    System.out.println(backwardsRowTraversal(testOne));
    System.out.println(backwardsRowTraversal(testTwo));
    System.out.println(backwardsRowTraversal(testThree));
    System.out.println(backwardsRowTraversal(testFour));
    System.out.println(backwardsRowTraversal(testFive));
    System.out.println("");
    System.out.println(backwardsColumnTraversal(testOne));
    System.out.println(backwardsColumnTraversal(testTwo));
    System.out.println(backwardsColumnTraversal(testThree));
    System.out.println(backwardsColumnTraversal(testFour));
    System.out.println(backwardsColumnTraversal(testFive));
    System.out.println("");
    System.out.println(reverseBackwardsRowTraversal(testOne));
    System.out.println(reverseBackwardsRowTraversal(testTwo));
    System.out.println(reverseBackwardsRowTraversal(testThree));
    System.out.println(reverseBackwardsRowTraversal(testFour));
    System.out.println(reverseBackwardsRowTraversal(testFive));
    System.out.println("");
    System.out.println(reverseBackwardsColumnTraversal(testOne));
    System.out.println(reverseBackwardsColumnTraversal(testTwo));
    System.out.println(reverseBackwardsColumnTraversal(testThree));
    System.out.println(reverseBackwardsColumnTraversal(testFour));
    System.out.println(reverseBackwardsColumnTraversal(testFive));
  }
  
  static ArrayList<Integer> rowTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer> columnTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int j = 0; j < matrix[0].length; j++) {
      for(int i = 0; i < matrix.length; i++) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer>  reverseRowTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for(int i = matrix.length - 1; i >= 0; i--) {
      for(int j = 0; j < matrix[i].length; j++) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer> reverseColumnTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int j = matrix[0].length - 1; j >= 0; j--) {
      for(int i = 0; i < matrix.length; i++) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  //TODO: The first four work... the last four do not.  Will debug later
  
  static ArrayList<Integer> backwardsRowTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int i = 0; i < matrix.length; i++) {
      for(int j = matrix[i].length - 1; j > 0; j--) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer> backwardsColumnTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int j = 0; j < matrix[0].length; j++) {
      for(int i = matrix.length - 1; i > 0; i--) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer> reverseBackwardsRowTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int i = matrix.length - 1; i >= 0; i--) {
      for(int j = matrix[i].length - 1; j > 0; j--) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }
  
  static ArrayList<Integer> reverseBackwardsColumnTraversal(int[][] matrix) {
    ArrayList<Integer> answer = new ArrayList<Integer>();
    if(matrix.length == 0) {
      return answer;
    }
    for(int j = matrix[0].length - 1; j > 0; j--) {
      for(int i = matrix.length - 1; i > 0; i--) {
        answer.add(matrix[i][j]);
      }
    }
    return answer;
  }

}
