package lang;

// 기본형 값들을 객체로 사용할 때가 있음
// java.lang.Byte ==> byte의 객체
// java.lang.Short ==> short
// java.lang.Character ==> char
// java.lang.Integer ==> int
// java.lang.Long ==> long
// java.lang.Float ==> float
// java.lang.Double ==> double
// java.lang.Boolean ==> boolean

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10;

    Integer i2 = 10;
    Integer i3 = Integer.valueOf(20);

    // intValue() : Integer ==> int
    int result = i2.intValue();
    int result2 = i2; // 자동 형변환 Integer ==> int
  }
}
