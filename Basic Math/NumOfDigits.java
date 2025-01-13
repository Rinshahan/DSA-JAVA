import java.util.Scanner;

public class NumOfDigits {

  public static int countDigits(int numbers) {
    int count = 0;
    while (numbers > 0) {
      numbers /= 10;
      count++;
    }
    System.out.println(count);
    return count;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    countDigits(numbers);
    scanner.close();
  }
}
