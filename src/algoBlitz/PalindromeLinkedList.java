package algoBlitz;

import java.util.LinkedList;

public class PalindromeLinkedList {

  public static void main(String[] args) {
    int[] emptyArray = {};
    int[] testArrayOne = {1, 2, 3, 4, 5};
    int[] testArrayTwo = {1, 2};
    int[] testArrayThree = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    
    print(String.valueOf(palindromeList(emptyArray)));
    print(String.valueOf(palindromeList(testArrayOne)));
    print(String.valueOf(palindromeList(testArrayTwo)));
    print(String.valueOf(palindromeList(testArrayThree)));

  }
  
  static LinkedList<Integer> palindromeList(int[] arr){
    LinkedList<Integer> palindrome = new LinkedList<>();
    if(arr.length == 0) {
      return palindrome;
    } else if(arr.length == 1){
      palindrome.add(arr[0]);
      return palindrome;
    }
    palindrome.add(arr[arr.length - 1]);
    for(int i = arr.length - 2; i >= 0; i--) {
      palindrome.add(arr[i]);
      palindrome.addFirst(arr[i]);
    }
    
    return palindrome;
  }
  
  static void print(String msg) {
    System.out.println(msg);
  }

}
