package algoBlitz;

public class ReverseWordVariations {
  
  public static void main(String[] args) {
    String reverseLetters = "Reverse the words in this string";
    String rotateWords = "Rotate the words in this string";
    String reverseLettersInKChunks = "abcdefgh";
    
    System.out.println(reverseLettersInWords(reverseLetters));
    System.out.println(rotateWordsByK(rotateWords, 1));
    System.out.println(reverseLettersInKChunks(reverseLettersInKChunks, 4));
  }
  
  static String reverseLettersInKChunks(String str, int k) {
    char[] charArray = str.toCharArray();
    reverseLettersInKChunks(charArray, k);
    return String.valueOf(charArray);
  }
  static void reverseLettersInKChunks(char[] charArray, int k) {
    for(int i = 0; i < charArray.length; i+=k) {
      int start = i;
      int end = i + k - 1;
      while (start < end) {
        char swap = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = swap;
        start++;
        end--;
      }
    }
  }
  
  static String rotateWordsByK(String str, int k) {
    String[] strArray = str.split(" ");
    rotateWordsByK(strArray, k);
    return String.join(" ", strArray);
  }
  static void rotateWordsByK(String[] strArray, int k) {
    if(strArray.length <= 1) {
      return;
    }
    if(k < 0) {
      k = strArray.length - (Math.abs(k) % strArray.length);
    } else {
      k = k % strArray.length;
    }
    if(k == 0) {
      return;
    }
    
    reverseStringArray(strArray, 0, strArray.length);
    reverseStringArray(strArray, 0, strArray.length - k);
    reverseStringArray(strArray, strArray.length - k, strArray.length);
    
  }
  static void reverseStringArray(String[] strArray, int start, int end) {
    int i = start;
    int j = end - 1;
    while (i < j) {
      String swap = strArray[i];
      strArray[i] = strArray[j];
      strArray[j] = swap;
      i++;
      j--;
    }
  }

  
  static String reverseLettersInWords(String str) {
    String[] strArray = str.split(" ");
    reverseLettersInWords(strArray);
    return String.join(" ", strArray);
  }
  static void reverseLettersInWords(String[] strArray) {
    for(int i = 0; i < strArray.length; i++) {
      char[] charArray = strArray[i].toCharArray();
      int j = 0;
      int k = charArray.length - 1;
      while(j < k) {
        char swap = charArray[j];
        charArray[j] = charArray[k];
        charArray[k] = swap;
        j++;
        k--;
      }
      strArray[i] = String.valueOf(charArray);
    }
  }
}
