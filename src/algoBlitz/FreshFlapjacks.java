package algoBlitz;

import java.util.Stack;

public class FreshFlapjacks {

  static class Flapjacks {
    boolean conditions;
    int maxheight;

    Flapjacks(boolean conditions, int maxheight) {
      this.conditions = conditions;
      this.maxheight = maxheight;
    }

    public String toString() {
      return "[" + conditions + ", " + maxheight + "]";
    }
  }

  public static void main(String[] args) {
    int[] testOne = {2, -1, 3, -3, 2, -1}; // true, 4
    int[] testTwo = {-1, 2}; // false, 2
    int[] testThree = {2, -1}; // true, 2
    int[] testFour = {2, 1, -2, 3, -1, 1, 2, 3}; // false, 9
    System.out.println(doesItWork(testOne).toString());
    System.out.println(doesItWork(testTwo).toString());
    System.out.println(doesItWork(testThree).toString());
    System.out.println(doesItWork(testFour).toString());

  }

  static Flapjacks doesItWork(int[] orders) {
    Stack<Integer> stack = new Stack<Integer>();
    boolean conditions = true;
    int maxheight = 0;

    for (int i = 0; i < orders.length; i++) {
      if (orders[i] > 0) {
        for (int j = 0; j < orders[i]; j++) {
          stack.add(1);
        }
      } else if (orders[i] < 0) {
        if (Math.abs(orders[i]) > stack.size()) {
          conditions = false;
          orders[i] = stack.size();
        }
        for (int j = Math.abs(orders[i]); j > 0; j--) {
          stack.pop();
        }
      }
      if (stack.size() > maxheight) {
        maxheight = stack.size();
      }
    }

    if (maxheight > 4) {
      conditions = false;
    }

    return new Flapjacks(conditions, maxheight);
  }

}
