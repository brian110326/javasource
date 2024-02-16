package lang;

// extends Object가 기본
public class Value {

  int value;

  public Value(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Value) {
      Value v = (Value) obj;
      if (this.value == v.value) {
        return true;
      }
    }
    return false;
  }

  // 멤버변수들의 값을 확인하는 용도로 재정의
  @Override
  public String toString() {
    return "Value [value = " + value + "]";
  }
}
