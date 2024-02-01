package loop;

public class ForEx3 {

  public static void main(String[] args) {
    // 구구단 출력
    for (int i = 1; i < 10; i++) {
      System.out.printf("3 X %d = %d\n", i, 3 * i);
    }
    System.out.println();

    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d X %d = %d\n", i, j, i * j);
      }
      System.out.println();
    }
  }
}
