public class ReverseNumber {
  public static void main(String args[]) {
    int number = 789900;
    System.out.println(reverse(number));
  }

  public static int reverse(int numbers) {
    int reversed = 0;
    while (numbers > 0) {
      int lastDigit = numbers % 10;
      reversed = (reversed * 10) + lastDigit;
      numbers = numbers / 10;
    }
    return reversed;
  }
}
