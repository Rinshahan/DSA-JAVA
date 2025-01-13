import java.util.Scanner;

public class DigitConcept {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter the Numbers to extract");
    int Num = scanner.nextInt();
    System.out.println("Extraction taking place..." + Num);
    while (Num > 0) {
      int lastDigit = Num % 10;
      System.out.println("The Last digit is : " + lastDigit);
      Num = Num /= 10;
      System.out.println("Final Value : " + Num);
    }
    scanner.close();
  }
}