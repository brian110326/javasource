package loop;

public class ForEx6 {

  public static void main(String[] args) {
    // 1~ 100까지 숫자 중에서 3의 배수만 더하기
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        sum += i;
        System.out.print(i + "\t");
      }
    }
    System.out.println();
    System.out.println("3의 배수의 합계 :  " + sum);
    // for (int i = 0; i <= 100; i += 3) {
    //   sum += i;
    // }
  }
}
