package generics;

// 1개의 파일에 여러개의 클래스 작성 가능
// public class는 1개만 존재해야함

public class Fruit {

  @Override
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit {

  @Override
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {

  @Override
  public String toString() {
    return "Grape";
  }
}

class Toy {

  @Override
  public String toString() {
    return "Toy";
  }
}
