package algoBlitz;

public class PrintStairwell {

  public static void main(String[] args) {
    printStairwell("Stairwell");
    printStairwell("Jared");

  }
  
  static void printStairwell(String word) {
    printStairwell(word, 1);
  } 
  static void printStairwell(String word, int i) {
    if(i >= word.length()) {
      print(word);
    } else {
      print(word.substring(0, i));
      printStairwell(word, ++i);
    }
    
  }
  
  
  
  static void print(String msg) {
    System.out.println(msg);
  }

}
