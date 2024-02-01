package condition;

// 제어문 - 1) 조건문 2) 반복문
// 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
//            if, switch

public class ifEx1 {

  public static void main(String[] args) {
    // if(조건식){조건식이 참일 때 수행될 문장들}
    // 조건식이 참일 때 수행될 문장이 1개일 때 {} 생략가능

    int x = 0;
    if (x == 0) {
      System.out.println("x == 0");
    }

    if (!(x == 0)) {
      System.out.println("x != 0");
    }
  }
}
