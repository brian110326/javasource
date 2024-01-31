package exam;

public class Result300 {

  public static void main(String[] args) {
    int value = 356;
    // 출력 결과가 300이 나올 수 있도록 산술 연산 기호 사용
    int result1 = value - 56;
    int result2 = (value / 100) * 100;

    System.out.printf("결과값1 : %d, 결과값2 : %d\n", result1, result2);

    int num = 24;
    // 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지 구하기
    int num1 = (num / 10) * 10 + 10;
    int result = num1 - num;

    int num2 = 333;
    // num2의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
    int result3 = (num2 / 10) * 10 + 1;
    System.out.println(result3);
  }
}
