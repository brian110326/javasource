package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// java.util.function 패키지
// 함수형 인터페이스 제공

// 메소드
// 매개변수 없고 반환값도 없음 : void run() ==> java.lang.Runnable
// 매개변수 없고 반환값 있음 : int run() ==> Supplier<T>  T get()
// 매개변수 있고 반환값 없음 : void run(int a) ==> Consumer<T> void accept(T t)
// 매개변수 있고 반환값 있음 : int run(int a) ==> Function<T, R> R apply(T t)
// 조건식 표현할 때 사용되는 메소드 : boolean test(int a) ==> Predicate<T> boolean test(T t)

// Bi~~ : 매개변수의 개수가 2개인 함수형 인터페이스
// void run(int a, String str) ==> BiConsumer<T, U> void accept(T t , U u)
// int run(String a, float f) ==> BiFunction<T,U,R> R apply(T t)
// boolean test(int a, double d) ==> BiPredicate<T, U> boolean test(T t, U u)

// Function과 유사
// 매개변수 타입과 반환 타입이 모두 일치한다
// UnaryOperator<T>  T apply(T t)
// BinaryOperator<T>  T apply(T t, T u)

// 기본형을 이용하는 함수형 인터페이스
// ToIntFunction ==> int applyAsInt(T value)

public class LambdaEx3 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100);
    System.out.println(s.get());

    Consumer<Integer> consumer = i -> System.out.println(i);
    consumer.accept(10);

    Function<Integer, Integer> function = i -> i / 10;
    System.out.println(function.apply(453));

    Predicate<Integer> predicate = i -> i % 2 == 0;
    System.out.println(predicate.test(11));

    // "5698" ==> 5698 + 30 ==> 5728 return
    Function<String, Integer> f2 = str -> Integer.parseInt(str) + 30;
    System.out.println(f2.apply("5698"));

    // 문자열의 길이가 0인지를 판별
    Predicate<String> predicate2 = str2 -> str2.length() == 0;
    System.out.println(predicate2.test("ddd"));

    // 문자열 리턴
    Supplier<String> supplier = () -> "문자열";
    System.out.println(supplier.get());

    // 문자열을 받아서 그 문자열을 그대로 출력
    Consumer<String> consumer2 = str3 -> System.out.println(str3);
    consumer2.accept("Hello");

    // 2개의 숫자를 받아서 더하기 한 후 return
    BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) ->
      num1 + num2;
    System.out.println(biFunction.apply(3, 7));

    // 2개의 숫자를 받아서 큰 값 출력
    BiConsumer<Integer, Integer> biConsumer = (num1, num2) ->
      System.out.println(num1 > num2 ? num1 : num2);
    biConsumer.accept(3, 9);

    // 2개의 String을 받아서 연결한 후 하나의 문자열로 리턴
    BiFunction<String, String, String> biFunction2 = (s1, s2) -> s1.concat(s2);
    System.out.println(biFunction2.apply("Dog", "Cat"));
  }
}
