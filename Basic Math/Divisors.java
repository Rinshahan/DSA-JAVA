public class Divisors {
  public static void main(String[] args) {
    int num = 20;

    divisors(num);
  }

  public static void divisors(int num) {

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i);
      }
    }

  }
}
