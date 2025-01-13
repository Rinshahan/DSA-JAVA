public class Palindrome {
  public static void main(String[] args) {
    int num = 111;
    System.out.print(isPalindrome(num));
  }

  public static boolean isPalindrome(int x) {
    int reversed = 0;
    int normal = x;
    while (x > 0) {
      int lastDigit = x % 10;
      reversed = reversed * 10 + lastDigit;
      x /= 10;
    }
    if (normal == reversed) {
      return true;
    } else {
      return false;
    }
  }
}
