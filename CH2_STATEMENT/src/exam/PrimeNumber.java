package exam;

public class PrimeNumber {

  public static void main(String[] args) {
    // 1 ~ 100소수찾기
    // 2 3 5 7 11 13...
    int count = 0;
    int total_count = 0;
    for (int i = 2; i <= 100; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }

      if (count == 2) {
        System.out.print(i + "\t");
        total_count++;
      }
      count = 0;
    }
    System.out.println();
    System.out.println("소수 개수 : " + total_count);
  }
}
