import java.util.ArrayList;

public class Divisors {
  public static void main(String[] args) {
    int num = 36;

    divisors(num);
  }

  public static void divisors(int num) {
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        arr.add(i);
        if ((num / i) != i) {
          arr.add(num / i);
        }
      }
    }
    arr.sort(null);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
