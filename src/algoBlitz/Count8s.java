package algoBlitz;

public class Count8s {

  public static void main(String[] args) {
    System.out.println(count8(8));
    System.out.println(count8(8818));
    System.out.println(count8(101));
    System.out.println(count8(0));

  }
  
  static int count8(int num) {
    int answer = 0;
    while (num > 0){
      if(num % 100 == 88) {
        answer += 2;
      } else if (num % 10 == 8) {
        answer += 1;
      }
      num /= 10;
    }
    return answer;
  }
  
  static int count8Recursive(int num) {
    if(num == 0) {
      return num;
    } else if (num % 100 == 88) {
      return 2 + count8Recursive(num / 100);
    } else if(num % 10 == 8) {
      return 1 + count8Recursive(num / 10);
    } else {
      return count8Recursive(num / 10);
    }
  }

}
