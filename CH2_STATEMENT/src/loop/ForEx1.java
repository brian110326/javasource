package loop;

// 반복문
// 어떤 작업이 반복적으로 수행되도록 할 때 사용

public class ForEx1 {

  public static void main(String[] args) {
    // for (int i = 0; i < args.length; i++) {
    //   // int i = 0 => 초기화 단게(제일 처음만 실행)
    //   // i < args.length => 조건식(조건식이 참일 때까지만 반복)
    //   // i++ => i 증감(반복문 제어하는 변수의 값을 증감)
    // }

    // 1) int i = 0
    // 2) i < 5
    // 3) 반복문 안으로 진입 : sysout 실행
    // 4) i++ => i = 1
    // 5) 다시 조건 검사
    // i = 5 => 조건이 false가 되어 루프 종료
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it");
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}
