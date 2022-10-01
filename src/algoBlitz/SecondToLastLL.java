package algoBlitz;

import java.util.LinkedList;

public class SecondToLastLL {

  public static void main(String[] args) {
    LinkedList<Integer> testListOne = new LinkedList<>();
    testListOne.add(1);
    testListOne.add(8);
    testListOne.add(9);
    testListOne.add(12);
    
    try {
      System.out.println(secondToLast(testListOne));
    } catch (Exception e) {
      System.out.println(e);
    }

  }
  
  static <Optional>int secondToLast(LinkedList<Integer> list) throws Exception {
    if(list.size() <= 1) {
      throw new Exception("Bad Input");
    }
    return list.get(list.size() - 2);
  }

}
