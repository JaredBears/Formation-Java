package algoBlitz;

public class SubstringCount {
  public static void main(String[] args) {
    print(countSubstring("catcowcat", "cat")== 2); // 
    print(countSubstring("catcowcat", "cow") == 1);
    print(countSubstring("catcowcat", "dog") == 0);
    print(countSubstring("cacatcowcat", "cat") == 2);
    print(countSubstring("xyx", "x") == 2);
    print(countSubstring("iiiijj", "i") == 4);
    print(countSubstring("iiiijj", "ii") == 2);
    print(countSubstring("iiiijj", "iii") == 1);
    print(countSubstring("iiiijj", "j") == 2);
    print(countSubstring("iiiijj", "jj") == 1);
    print(countSubstring("aaabababab", "ab") == 4);
    print(countSubstring("aaabababab", "aa") == 1);
    print(countSubstring("aaabababab", "a") == 6);
    print(countSubstring("aaabababab", "b") == 4);
  }
  
  static int countSubstring(String str, String sub) {
    if(str.length() == 0 || sub.length() == 0 || str.length() < sub.length())
      return 0;
    if(str.startsWith(sub)) {
      return 1 + countSubstring(str.substring(sub.length()), sub);
    }
    return 0 + countSubstring(str.substring(1), sub);
  }
  
  static void print(Boolean msg) {
    System.out.println(msg);
  }
}
