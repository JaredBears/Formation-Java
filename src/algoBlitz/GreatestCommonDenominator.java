package algoBlitz;

public class GreatestCommonDenominator {
  
  public static void main(String[] args) {
    System.out.println(gcd(9, 27) == 9);
    System.out.println(gcd(0, 5) == 5);
    System.out.println(gcd(3, 9) == 3);
    System.out.println(gcd(15, 25) == 5);
    System.out.println(gcd(-15, 25) == 5);
  }
  
  static int gcd(int x, int y) {
    x = Math.abs(x);
    y = Math.abs(y);
    if(x == 0) {
      return y;
    } if (y == 0) {
      return x;
    }
    return gcd(y, x % y);
  }

}
