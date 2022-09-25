package algoBlitz;

import java.util.HashMap;
import java.util.LinkedList;

public class ParentToChild {

  public static void main(String[] args) {
    String[][] relationsOne = {{"James", "Ben", "Lisa"}};
    String[][] relationsTwo =
        {{"James", "Ben", "Lisa"}, {"George", "Taylor", "Fred"}, {"Jen", "Ben", "Gloria"}};
    String[][] relationsThree = {{}};
    String[][] relationsFour = {{"Justine", "Tony", "Jessica"}, {"Paavo", "Jessica", "Tony"}, {"Zoe", "Jessica", "Tony"}, {"Benana", "Ben", "Ana"}, {"Egg", "Rooster", "Hen"}, {"Eggart", "Duck", "Hen"}, {"Mule", "Horse", "Donkey"}};
    
    System.out.println("\n");
    parentToChild(relationsOne);
    System.out.println("\n");
    parentToChild(relationsTwo);
    System.out.println("\n");
    parentToChild(relationsThree);
    System.out.println("\n");
    parentToChild(relationsFour);

  }

  static void parentToChild(String[][] relationships) {
    if(relationships == null || relationships.length == 0 || relationships[0].length == 0) {
      System.out.println("No Family Relations");
      return;
    }
    HashMap<String, LinkedList<String>> parentTable = new HashMap<String, LinkedList<String>>();

    for (int i = 0; i < relationships.length; i++) {
      for (int j = 1; j <= 2; j++) {
        String parent = relationships[i][j];
        String child = relationships[i][0];
        LinkedList<String> children = new LinkedList<String>();
        if (!parentTable.containsKey(parent)) {
          children.add(child);
          parentTable.put(parent, children);
        } else {
          children = parentTable.get(parent);
          children.add(child);
          parentTable.put(parent, children);
        }
      }

    }

    parentTable.forEach((key, value) -> {
      System.out.println(key + " is the parent of " + value.toString());
    });
  }

}
