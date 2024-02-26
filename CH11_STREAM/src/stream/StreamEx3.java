package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambda.Student;

public class StreamEx3 {

  public static void main(String[] args) {
    //  Stream 최종연산 ==> Stream의 요소를 소모해서 결과를 만들어냄, 최종 연산 후에는 스트림 닫힘
    // forEach(), 통계 : count(), sum(), average(), max(), min()
    // collect()

    Stream<Student> stream = Stream.of(
      new Student("Aa", 90, 80),
      new Student("Bb", 100, 78),
      new Student("Cc", 88, 60),
      new Student("Dd", 98, 92),
      new Student("Ee", 77, 94)
    );

    // 수학점수 모으기
    // stream.map(Student::getMath).forEach(System.out::println);

    // 수학점수 모아서리스트로 반환
    List<Integer> mathList = stream
      .map(Student::getMath)
      .collect(Collectors.toList());
    System.out.println(mathList);

    Stream<String> stream2 = Stream.of(
      "abc",
      "def",
      "apple",
      "melon",
      "text",
      "peek"
    );

    // 스트림 문자열을 대문자로 변경한 후 출력
    //stream2.map(String::toUpperCase).forEach(System.out::println);

    // 스트림 문자열을 대문자로 변경한 후 list로
    List<String> list = stream2
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println(list);

    IntStream stream3 = IntStream.rangeClosed(1, 10);
    // 짝수의 개수를 출력
    // long count = stream3.filter(i -> i % 2 == 0).count();
    // System.out.println("짝수 개수 : " + count);

    // 합계
    int sum = stream3.filter(i -> i % 2 == 0).sum();
    System.out.println("짝수 합계 : " + sum);

    // 전체 합계
    System.out.println("전체 합 : " + IntStream.rangeClosed(1, 10).sum());

    // 평균
    // return type : Optional<T>, OptionalInt, OptionalDouble, OptionalLong
    // 최종 연산의 결과를 Optional 객체에 담아서 반환 ==> null 체크하기 위한 if문 사용 안함
    // return 값이 null인지 아닌지 판단하는 코드 사용 ==> 안하면 NullPointerException 발생 막기위해서

    Optional<String> optional = Optional.of("abcde");
    System.out.println(optional.get());
    System.out.println(optional.isPresent());

    // 전체 평균
    System.out.println("전체 평균 : " + IntStream.rangeClosed(1, 10).average());

    // 최대/최소
    System.out.println("최대값 : " + IntStream.rangeClosed(1, 10).max());
    System.out.println("최소값 : " + IntStream.rangeClosed(1, 10).min());
    System.out.println(
      "첫번째 값 : " + IntStream.rangeClosed(1, 10).findFirst()
    );
  }
}
