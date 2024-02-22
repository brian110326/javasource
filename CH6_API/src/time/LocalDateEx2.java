package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// java.time.LocalDate : 날짜
// java.time.LocalTime : 시간
// java.time.LocalDateTime : 날짜 / 시간

public class LocalDateEx2 {

  public static void main(String[] args) {
    // 오늘날짜
    LocalDate today = LocalDate.now();

    // 현재시간
    LocalTime now = LocalTime.now();

    System.out.println(today); // 2024-02-22
    System.out.println("윤년 / 평년 : " + today.isLeapYear());
    System.out.println(now); // 15:00:42.588368900

    // 특정 날짜 지정
    LocalDate birthday = LocalDate.of(1950, 11, 23);
    LocalTime birthtime = LocalTime.of(23, 11, 44);

    // 날짜 덧셈
    System.out.println(birthday.plusDays(1));
    System.out.println(birthday.minusDays(20));

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);
    System.out.println(date.getHour());
    System.out.println(date.getMinute());
    System.out.println(date.getSecond());
    System.out.println(date.getYear());
    System.out.println(date.getMonth().getValue()); // getMonth() ==> FEBRUARY, getMonth().getValue() ==> 2
    System.out.println(date.getDayOfMonth());
    System.out.println();
  }
}
