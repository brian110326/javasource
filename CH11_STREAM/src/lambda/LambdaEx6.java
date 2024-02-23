package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 메소드 참조
// 람다식을 더 간결하게 사용
// 람다식이 하나의 메소드만 호출하는 경우 사용
// 클래스이름 :: 메소드명

public class LambdaEx6 {

  public static void main(String[] args) {
    // "5698" ==> 5698 + 30 ==> 5728 return
    //Function<String, Integer> f2 = str -> Integer.parseInt(str) + 30;
    Function<String, Integer> f2 = Integer::parseInt; //Integer에 있는 parseInt메소드 사용

    // 2개의 문자열을 받아서 문자열이 동일한지 return
    //BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.equals(s2);
    BiFunction<String, String, Boolean> f1 = String::equals; //String에 있는 equals메소드 사용

    // Supplier<Student> s = () -> new Student();
    Supplier<Student> s = Student::new;
  }
}
