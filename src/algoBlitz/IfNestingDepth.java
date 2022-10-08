package algoBlitz;

import java.util.Stack;

public class IfNestingDepth {
  
  public static void main(String[] args) {
    String[] testOne = {"if"};
    String[] testTwo = {"endif"};
    String[] testThree = {"if", "endif"};
    String[] testFour = {"if", "else", "endif"};
    String[] testFive = {"if", "endif", "if", "endif"};
    String[] testSix = {"if", "if", "endif", "endif"};
    String[] testSeven = {"if", "if", "if", "endif", "endif", "endif"};
    String[] testEight = {"if", "if", "if", "endif", "endif", "if", "endif", "endif"};
    String[] testNine = {"if", "if", "if", "endif", "endif", "if", "endif", "if", "endif"};
    String[] testTen = {"if", "if", "endif", "else", "if", "endif"};
    
    System.out.println(vbNesting(testOne) == -1);
    System.out.println(vbNesting(testTwo) == -1);
    System.out.println(vbNesting(testThree) == 1);
    System.out.println(vbNesting(testFour) == 1);
    System.out.println(vbNesting(testFive) == 1);
    System.out.println(vbNesting(testSix) == 2);
    System.out.println(vbNesting(testSeven) == 3);
    System.out.println(vbNesting(testEight) == 3);
    System.out.println(vbNesting(testNine) == -1);
    System.out.println(vbNesting(testTen) == -1);
  }
  
  static int vbNesting(String[] controlFlow) {
    Stack<Integer> stack = new Stack<Integer>();
    int maxLevel = 0;
    
    for(String str : controlFlow) {
      if(stack.size() == 0 && (str.equals("else") || str.equals("endif"))){
        return -1;
      }
      if(stack.size() == maxLevel && str.equals("if")) {
        maxLevel += 1;
      }
      if(str.equals("if")) {
        stack.add(1);
      } else if(str.equals("endif")) {
        stack.pop();
      }
    }
    
    if(stack.size() > 0) {
      return -1;
    }
    
    return maxLevel;
  }

}
