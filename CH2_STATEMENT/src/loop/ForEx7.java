package loop;

public class ForEx7 {

  public static void main(String[] args) {
    // 3의 배수를 더하기 단, 9의 배수는 빼고
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 9 != 0) {
        sum += i;
        System.out.print(i + "\t");
      }
    }
    System.out.println();
    System.out.println("합 : " + sum);

    // 1~100중 3과 5의 배수의 합
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
        System.out.print(i + "\t");
      }
    }
    System.out.println();
    System.out.println("합계 : " + sum);
  }
}
