package loop;

public class ForEx2 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + 1);
    }

    // 1 ~ 10의 합계 구하기
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("합계 : " + sum);

    // 1 ~ 10 출력, 10 ~ 1 출력
    for (int i = 1; i <= 10; i++) {
      System.out.print(i);
    }

    for (int i = 1; i <= 10; i++) {
      System.out.println(11 - i);
    }
  }
}
