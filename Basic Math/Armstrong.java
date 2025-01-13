public class Armstrong {
  public static void main(String args[]) {
    isArmStrong(153);
  }

  public static boolean isArmStrong(int number) {
    int armstrong = 0;
    int dup = number;
    while (number > 0) {
      int lastDigit = number % 10;
      armstrong = armstrong + (lastDigit * lastDigit * lastDigit);
      number = number / 10;
    }
    System.out.println(armstrong);
    if (armstrong == dup) {
      return true;
    } else {
      return false;
    }
  }
}
