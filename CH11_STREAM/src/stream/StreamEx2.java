package stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import lambda.Student;

public class StreamEx2 {

  public static void main(String[] args) {
    List<File> list = Arrays.asList(
      new File("Ex1.java"),
      new File("Ex2"),
      new File("Ex3.bak"),
      new File("Ex4.java"),
      new File("Ex5.txt")
    );

    Set<String> exSet = new HashSet<>();

    // 파일명 추출하기 + 확장자만 뽑아내기
    //list.forEach(file -> System.out.println(file.getName()));
    for (File file : list) {
      String fileName = file.getName();
      if (fileName.lastIndexOf(".") != -1) {
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        exSet.add(ext);
      }
    }

    System.out.println(exSet);

    // Stream<File> stream = list.stream();
    // 처음부터 Stream으로 만들기
    Stream<File> stream = Stream.of(
      new File("Ex1.java"),
      new File("Ex2"),
      new File("Ex3.bak"),
      new File("Ex4.java"),
      new File("Ex5.txt")
    );

    // map() : 스트림의 요소에 저장된 값 중에서 원하는 필드만 추출하거나 특정 형태로 변환하는 경우 사용
    // 파일의 스트림에서 이름 추출한 후 출력
    //stream.map(f -> f.getName()).forEach(f -> System.out.println(f));
    //stream.map(File::getName).forEach(System.out::println);

    // 파일의 스트림에서 이름 추출한 후 확장자만 출력(중복 제거)
    // stream
    //   .map(File::getName)
    //   .filter(s -> s.lastIndexOf(".") != -1) //확장자 없는 파일 제거
    //   .map(f -> f.substring(f.lastIndexOf(".") + 1)) //확장자 모으기
    //   .distinct() //중복제거
    //   .forEach(System.out::println); //최종 출력으로 확인

    Stream<String> stream2 = Stream.of(
      "바둑",
      "바나나",
      "포도",
      "딸기",
      "바질",
      "강아지",
      "고양이"
    );
    // "바"로 시작하는 문자열 추출
    stream2.filter(s -> s.startsWith("바")).forEach(System.out::println);

    Stream<Student> stream3 = Stream.of(
      new Student("Aa", 90, 80),
      new Student("Bb", 100, 78),
      new Student("Cc", 88, 60),
      new Student("Dd", 98, 92),
      new Student("Ee", 77, 94)
    );
    // 이름만 출력
    //stream3.map(Student::getName).forEach(System.out::println);

    // A로 시작하는 이름만 출력
    // stream3
    //   .map(Student::getName)
    //   .filter(s -> s.startsWith("A"))
    //   .forEach(System.out::println);
    stream3
      .filter(s -> s.getName().startsWith("A"))
      .forEach(System.out::println);

    // peak : 조회 ==> 연산과 연산 사이에 올바르게 처리되었는지 확인(중간연산)
    // forEach ==> 최종연산이기 때문에 스트림이 소모됨 ==> 중간 확인용으로 peek 사용
    stream
      .map(File::getName)
      .filter(s -> s.lastIndexOf(".") != -1) //확장자 없는 파일 제거
      .peek(s -> System.out.printf("fileName = %s\n", s)) //필터링 결과 중간확인
      .map(f -> f.substring(f.lastIndexOf(".") + 1)) //확장자 모으기
      .peek(s -> System.out.printf("fileName = %s\n", s)) //필터링 결과 중간확인
      .distinct() //중복제거
      .forEach(System.out::println);
  }
}
